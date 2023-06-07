
public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(100);
        plate.info();
        cat.info();
        cat.eat(plate.getFood());
        plate.setFood(plate.getFood() - cat.getAppetite());  
        plate.info();
        cat.info();

        System.out.println("------------------------");
        Cat[] cats = {new Cat("Степан", 10),
                      new Cat("Пафнутий", 50),
                      new Cat("Гаврила", 10),
                      new Cat("Мурзик", 15)};
        Plate plateForCats = new Plate(50);
        for(Cat newCat : cats){
            newCat.eat(plateForCats.getFood());
            plateForCats.setFood(plateForCats.getFood() - newCat.getAppetite());  
            newCat.info();
        }
    }
    
}