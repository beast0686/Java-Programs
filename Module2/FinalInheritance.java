package Module2;

/*final*/ class Parent {
    public void display() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    public void display() {
        System.out.println("This is Clid class");
    }
}

public class FinalInheritance {
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent c = new Child();

        p.display();
        c.display();
    }
}
