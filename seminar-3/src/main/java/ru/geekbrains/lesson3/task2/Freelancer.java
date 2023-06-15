package ru.geekbrains.lesson3.task2;

// 20 * 8

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания
 */
public class Freelancer extends Employee {

    double workHours; // сколько часов в неделю работает фрилансер

    public Freelancer(String name, String surname, double salary, int age, double workHours) {
        super(name, surname, age, salary);
        this.workHours = workHours;
    }

    public double getWorkHours(){
        return this.workHours;
    }

    @Override
    public double calculateSalary() {
        return this.salary + this.workHours * 20;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Возраст: %d(лет); Колич. отраб. часов: %.1f  Почасовая ежемесячная зарплата: %.2f (руб.)", 
        name, surname, age, workHours, calculateSalary());
    }
}
