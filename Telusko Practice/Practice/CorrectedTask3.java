class Rectangle {
    int length;
    int width;

    // Constructor to initialize values
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    int area() {
        return length * width;
    }

    int perimeter() {
        return 2 * (length + width);
    }
}

public class CorrectedTask3 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(2, 5);
        Rectangle rect2 = new Rectangle(4, 3);

        System.out.println("Rectangle 1 - Area      : " + rect1.area());
        System.out.println("Rectangle 1 - Perimeter : " + rect1.perimeter());

        System.out.println("Rectangle 2 - Area      : " + rect2.area());
        System.out.println("Rectangle 2 - Perimeter : " + rect2.perimeter());
    }
}
