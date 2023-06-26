package seminar6;

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        Input input = new Input(order);
        Saving saving = new Saving(order);
        input.inputFromConsole();
        saving.saveToJson();
    }
}
