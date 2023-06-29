package ru.geekbrains.lesson7.observer;

import java.util.ArrayList;

public class Program {

    /**
     * TODO: 1. Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить свой собственный тип/типы соискателя.
     *  2**. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  3**. Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Master ivanov = new Master("Ivanov", new ArrayList<>(){
            {
                add(VacancyTypes.Manager);
                add(VacancyTypes.SecurityGuard);
            }
        });
        Master petrov = new Master("Petrov", new ArrayList<>(){
            {
                add(VacancyTypes.Programmer);
            }
        });
        Student sidorov = new Student("Sidorov", new ArrayList<>(){
            {
                add(VacancyTypes.Tester);
                add(VacancyTypes.Cleaner);
            }
        });
        Student smirnov = new Student("Smirnov", new ArrayList<>(){
            {
                add(VacancyTypes.Manager);
                add(VacancyTypes.Tester);
            }
        });

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(smirnov);

        for (int i = 0; i < 5; i++){
            geekBrains.needEmployee(VacancyTypes.Tester);
            google.needEmployee(VacancyTypes.Manager);
            yandex.needEmployee(VacancyTypes.Programmer);
        }
    }

}
