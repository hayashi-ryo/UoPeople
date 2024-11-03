import jeliot.io.*;

public class Polygon {
    int sides;

    Polygon() {
    }

    Polygon(int s) {
        sides = s;
    }

    public int getSides() {
        return sides;
    }
}

public class Rectangle extends Polygon {
    int width, heigth;

    Rectangle() {
        super(4);
        width = 0;
        heigth = 0;
    }

    Rectangle(int w, int h) {
        super(4);
        width = w;
        heigth = h;
    }

    public int getArea() {
        return width * heigth;
    }
}

public class Square extends Rectangle {
    int side;

    Square() {
        side = 0;
    }

    Square(int s) {
        super(s, s);
        side = s;
    }
}

public class MyClass {
    public static void main() {
        Square square;
        square = new Square(3);
        int area = square.getArea();
        System.out.println("The area of the square is " + area);
    }
}
