package com.example.Vacancies.repository;

import com.example.Vacancies.model.Vacancies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VacancyRepository extends JpaRepository<Vacancies, Long> {

}
