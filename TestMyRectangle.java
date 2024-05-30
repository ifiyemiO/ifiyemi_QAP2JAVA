package ifiyemi_QAP2JAVA;
public class TestMyRectangle {
    public static void main(String[] args) {
        // Test MyRectangle with (x1, y1, x2, y2) constructor
        MyRectangle rect1 = new MyRectangle(1, 2, 5, 6);
        System.out.println(rect1);
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        // Test MyRectangle with MyPoint constructor
        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(7, 8);
        MyRectangle rect2 = new MyRectangle(p1, p2);
        System.out.println(rect2);
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());

        // Test setters
        rect1.setTopLeft(new MyPoint(0, 0));
        rect1.setBottomRight(new MyPoint(10, 10));
        System.out.println(rect1);
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
    }
}

