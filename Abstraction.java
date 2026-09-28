abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle");
    }
}

public class Abstraction Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.area();
        r.area();
    }
}
