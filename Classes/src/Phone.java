import java.lang.String;

public class Phone {
    private long number;
    private String model;
    private double weight;

    public long getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит {" + name + "}");
    }


    public Phone(long number, String model, double weight) {

        this(number, model);
        this.weight = weight;
    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }


    public void receiveCall(String name, long number) {
       System.out.println("Вам звонит {" + name + "}" + number);
    }

    public void sendMessage(long... numbers) {
        for (long number : numbers)
            System.out.print(number + " ");
    }

    public static void main(String[] args) {

        Phone Samsung =new Phone(927174399,"Galaxy a 32",666);
        Phone Xiaomi = new Phone(987682559,"Redmi 9T",777);
        Phone iPhone = new Phone(852155214,"16",228);
        System.out.println("Samsung: " + Samsung.getNumber() + " " + Samsung.getModel() + " " + Samsung.getWeight() + " ");
        System.out.println("Xiaomi: " + Xiaomi.getNumber() + " " + Xiaomi.getModel() + " " + Xiaomi.getWeight() + " ");
        System.out.println("iPhone: " + iPhone.getNumber() + " " + iPhone.getModel() + " " + iPhone.getWeight() + " ");

        Samsung.receiveCall("Chyort");
        Samsung.getNumber();
        Xiaomi.receiveCall("Ya");
        Xiaomi.getNumber();
        iPhone.receiveCall("Sanya");
        iPhone.getNumber();

    }
}