package ru.geekbrains.lesson7.observer;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class Vacancy {

    private  String companyName;

    private VacancyTypes vacancyName;
    private  String description;
    private double salary;

    public Vacancy(String companyName, VacancyTypes vacancyName, String description, double salary) {
        this.companyName = companyName;
        this.vacancyName = vacancyName;
        this.description = description;
        this.salary = salary;
    }

    public VacancyTypes getVacancyName() {
        return vacancyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDescription() {
        return description;
    }

    public double getSalary() {
        return salary;
    }
}
