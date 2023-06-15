package ru.geekbrains.lesson3.task2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */
    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(20000, 80000);
        int freeLancerSalary = random.nextInt(200, 500);
        double workHours = random.nextInt(20, 140);
        int randomAge = random.nextInt(25, 80);

        Worker worker = new Worker(names[random.nextInt(2)], surnames[random.nextInt(surnames.length)], randomAge, salary);
        Freelancer freelancer = new Freelancer(names[random.nextInt(2)], surnames[random.nextInt(surnames.length)], freeLancerSalary, randomAge,  workHours);
        Employee[] employees = {worker, freelancer};
        
        return employees[random.nextInt(0, employees.length)];
    }


    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *   Придумать несколько Comparator'ов для сортировки сотрудников
     *   по фамилии + имени или по возрасту + уровню зп.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
        {
            employees[i] = generateEmployee();
        }

        //Arrays.sort(employees, new SalaryComparator());

        Arrays.sort(employees, new AgeComparator());

        for (Employee employee: employees) {
            System.out.println(employee);
        }


    }

}
