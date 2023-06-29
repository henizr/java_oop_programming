package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private static  Random random = new Random();
    private String companyName;
    private  double maxSalary;

    VacancyTypes vacancyName;

    private Publisher jobAgency;


    public Company(String companyName, double maxSalary, Publisher jobAgency) {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(VacancyTypes vacancyName){
        double salary = random.nextDouble(3000, maxSalary);
        jobAgency.sendOffer(new Vacancy(companyName, vacancyName, "", salary));
    }


}
