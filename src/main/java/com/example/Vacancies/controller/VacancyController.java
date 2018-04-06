package com.example.Vacancies.controller;

import com.example.Vacancies.exception.ResourceNotFoundException;
import com.example.Vacancies.model.Vacancies;
import com.example.Vacancies.repository.VacancyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
public class VacancyController {

    @Autowired
    VacancyRepository vacancyRepository;

    @GetMapping("/vacancy")
    public List<Vacancies> getAllNotes() {
        return vacancyRepository.findAll();
    }

    @PutMapping("/vacancy")
    public Vacancies createNote(@Valid @RequestBody Vacancies vacancies) {
        return vacancyRepository.save(vacancies);
    }

    @GetMapping("/vacancy/{id}")
    public Vacancies getNoteById(@PathVariable(value = "id") Long Id) {
        return vacancyRepository.findById(Id)
                .orElseThrow(() -> new ResourceNotFoundException("Vacancies", "id", Id));
    }

    @DeleteMapping("/vacancy/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long Id) {
        Vacancies vacancies = vacancyRepository.findById(Id)
                .orElseThrow(() -> new ResourceNotFoundException("Vacancies", "id", Id));

        vacancyRepository.delete(vacancies);

        return ResponseEntity.ok().build();
    }
}
