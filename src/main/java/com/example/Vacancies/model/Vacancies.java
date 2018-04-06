package com.example.Vacancies.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "vacanciestable")
@EntityListeners(AuditingEntityListener.class)
public class Vacancies {
    @Id
    private long id;
    private String name;
    private long salary;
    private String experience;
    private String city;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Vacancies(long id, String name, long salary, String experience, String city) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
        this.city = city;
    }
    public Vacancies(){

    }
}
