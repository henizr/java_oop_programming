package Fruits;

public class Program {
    public static void main(String[] args) {

        Box<Apple> boxForApples1 = new Box<>();
        boxForApples1.add(new Apple());
        boxForApples1.add(new Apple());
        boxForApples1.add(new Apple());
        boxForApples1.add(new Apple());
        boxForApples1.add(new Apple());
        boxForApples1.add(new Apple());

        Box<Apple> boxForApples2 = new Box<>();
        boxForApples2.add(new Apple());
        boxForApples2.add(new Apple());
        boxForApples2.add(new Apple());
        boxForApples2.add(new Apple());
        boxForApples2.add(new Apple());
        boxForApples2.add(new Apple());

        Box<Orange> boxForOranges1 = new Box<>();
        boxForOranges1.add(new Orange());
        boxForOranges1.add(new Orange());
        boxForOranges1.add(new Orange());
        boxForOranges1.add(new Orange());
        boxForOranges1.add(new Orange());
        boxForOranges1.add(new Orange());


        // сравниваем коробкИ с яблоками
        if(boxForApples1.compare(boxForApples1)){
            System.out.println("Коробки имеют одинаковый вес");
        }
        else {
            System.out.println("Коробки имеют разный вес");
        }

        // сравниваем коробку с яблоками и коробку с апельсинами
        if(boxForApples1.compare(boxForOranges1)){
            System.out.println("Коробки имеют одинаковый вес");
        }
        else {
            System.out.println("Коробки имеют разный вес");
        }

        // пересыпаем яблоки
        boxForApples1.intersperse(boxForApples2);

    }
}
