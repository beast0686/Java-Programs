package Module2;

class Animals {
    public void makesound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animals {
    public void makesound() {
        System.out.println("Bark");
    }
}

class Cat extends Animals {
    public void makesound() {
        System.out.println("Meow");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animals a = new Animals();
        Animals d = new Dog();
        Animals c = new Cat();
        a.makesound();
        d.makesound();
        c.makesound();
    }
}
