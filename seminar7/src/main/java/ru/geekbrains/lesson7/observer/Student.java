package ru.geekbrains.lesson7.observer;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student implements Observer {

    private static Random random = new Random();
    private String name;

    private List<VacancyTypes> vacancyTypes;
    private double minSalary;

    public List<VacancyTypes> getVacancyTypes() {
        return vacancyTypes;
    }

    public Student(String name, List<VacancyTypes> vacancyTypes) {
        this.name = name;
        minSalary = random.nextDouble(2000, 4000);
        this.vacancyTypes = vacancyTypes;
    }

    @Override
    public boolean receiveOffer(Vacancy vacancy) {
        if (minSalary <= vacancy.getSalary()) {
            System.out.printf("Студент %s (%f) >>> Мне нужна эта работа! [%s - %f]\n",
                    name, minSalary, vacancy.getCompanyName(), vacancy.getSalary());
            minSalary = vacancy.getSalary();
            return true;
        } else {
            System.out.printf("Студент %s >>> Я найду работу получше (%f)! [%s - %f]\n",
                    name, minSalary, vacancy.getCompanyName(), vacancy.getSalary());
            return false;
        }
    }
}