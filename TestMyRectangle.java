public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint2 topLeft = new MyPoint2(0, 0);
        MyPoint2 bottomRight = new MyPoint2(20, 10);
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    
    }
}