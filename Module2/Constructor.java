package Module2;

class Car {
    String name;
    String model;
    int date;

    public Car(String name, String model, int date) {
        this.name = name;
        this.model = model;
        this.date = date;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Date: " + date);
        System.out.println();
    }
}

public class Constructor {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", "City", 2015);
        Car c2 = new Car("Hyundai", "Santafe", 2014);

        c1.display();
        c2.display();
    }
}
