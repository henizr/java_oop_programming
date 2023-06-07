public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public int getAppetite(){
        return this.appetite;
    }
    public boolean getSatiety(){
        return this.satiety;
    }
    public void setSatiety(boolean satiety){
        this.satiety = satiety;
    }
    public void eat(int food) { 
        if(food >= appetite){
            this.satiety = true;
        }
        else{
            this.satiety = false;
        }
    }
    public void info(){
        System.out.println("Имя кота: " + this.name + " | " + "Сытость кота: " + this.getSatiety());
    }
}
