package Fruits;
import java.util.ArrayList;

public class Box<T extends  Fruit>{
    private final ArrayList<T> fruits;

    public Box(){
        fruits = new ArrayList<>();
    }
    public double getWeight(){
        double weight = 0f;

        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }

        return weight;
    }

    public void add(T fruit){
        this.fruits.add(fruit);
    }

    public boolean compare(Box<?> box){
        if(this.getWeight() == box.getWeight()){
            return true;
        }
        return false;
    }

    public void intersperse(Box box){
        for (int i = 0; i < this.fruits.size(); i++) {
            box.fruits.add(this.fruits.remove(i));
            i--;
        }
        System.out.println("\nПосле пересыпания");
        System.out.printf("в первой коробке осталось %.1f ед.\n", this.getWeight());
        System.out.printf("в первой коробке осталось %.1f ед.\n", box.getWeight());
    }
}
