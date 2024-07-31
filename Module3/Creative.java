package Module3;

interface Drawable {
    public void draw();
}

class Square implements Drawable {
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

public class Creative {
    public static void main(String[] args) {
        Drawable s = new Square();
        s.draw();
    }
}
