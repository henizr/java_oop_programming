package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        int a = 1;
        Product product1;

        product1 = new Product("ООО Лучшая вода", "Бу", -100.12);
        //product1.brand = "ООО Лучшая вода";
        //product1.name = "Бутылка с водой";
        //product1.price = -50;
        //product1.name = "A";
        System.out.println(product1.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [1]", 115, 1);
        Product bottleOfWater2 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [2]", 215, 1.5);

        BottleOfWater bottleOfWater3 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [3]", 1115, 1.5);

        Product bottleOfWater4 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [4]", 55, 2);

        System.out.println(bottleOfWater1.displayInfo());
        Product bottleOfMilk1 = new BottleOfMilk("ООО Чистый источник", "Бутылка с молоком", 115, 1.5,10);
        System.out.println(bottleOfMilk1.displayInfo());


        Product bottleOfJuice = new BottleOfJuice("ООО Урожайная пора", "Апельсиновый сок", 150, 2, "opange", 60);
        System.out.println(bottleOfJuice.displayInfo());    
        
        Product bottleOfJuice2 = new BottleOfJuice("ООО Урожайная пора", "Апельсиновый сок", 150, 2, "opange", 80);
        System.out.println(bottleOfJuice2.displayInfo()); 

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater4);
        products.add(bottleOfWater3);
        products.add(bottleOfJuice);
        products.add(bottleOfJuice2);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(2);
        if (bottleOfWaterResult != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }


        BottleOfJuice bottleOfJuiceResult = vendingMachine.getBottleOfJuice(80);

        if (bottleOfJuiceResult != null){
            System.out.println("Вы купили сок : ");
            System.out.println(bottleOfJuiceResult.displayInfo());
        }
        else {
            System.out.println("Сока с таким количеством калорий нет в автомате.");
        }

    }

}
