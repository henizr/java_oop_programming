package ru.geekbrains.lesson1;

public class BottleOfJuice extends Product {
    
    private String fruitType;
    private float calories;
    private double volume;

    public BottleOfJuice(String brand, String name, double price, double volume, String fruitType, float calories){
        super(brand, name, price);
        this.fruitType = fruitType;
        this.calories = calories;
        this.volume = volume;
    }


    public String getFruitType(){
        return this.fruitType;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setFruitType(String fruitType){
        this.fruitType = fruitType;
    }

    public float getCalories(){
        return this.calories;
    }

    public void setCalories(float calories){
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("[Пакет]%s - %s - %f - [объем: %f][фрукт:  %s][калории: %f]", brand, name, price, volume, fruitType, calories);
    }

}
