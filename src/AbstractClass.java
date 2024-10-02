public class AbstractClass {

    // Abstract classes can have some methods unimplemented
    // allowing child classes to provide their own implementation
    public static void main(String[] args) {
        // It cant be instantiated
        // GeometricFigure geometricFigure = new GeometricFigure();
        GeometricFigure geometricFigure = new Rectangle();
        geometricFigure.draw();

        GeometricFigure circle = new Circle();
        circle.draw();
    }
}

// Abstract class
// An abstract class can't be instantiated
abstract class GeometricFigure {
    public abstract void draw();

}


class Rectangle extends GeometricFigure {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}

class Circle extends GeometricFigure {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}


