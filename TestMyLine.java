package ifiyemi_QAP2JAVA;

public class TestMyLine {
    public static void main(String[] args) {
        // Test MyLine with (x1, y1, x2, y2) constructor
        MyLine line1 = new MyLine(1, 2, 3, 4);
        System.out.println(line1);

        // Test MyLine with MyPoint constructor
        MyPoint p1 = new MyPoint(5, 6);
        MyPoint p2 = new MyPoint(7, 8);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println(line2);

        // Test getters and setters
        line1.setBegin(new MyPoint(9, 10));
        line1.setEnd(new MyPoint(11, 12));
        System.out.println(line1);
        System.out.println("Begin: " + line1.getBegin());
        System.out.println("End: " + line1.getEnd());

        // Test getting and setting individual coordinates
        line2.setBeginX(13);
        line2.setBeginY(14);
        line2.setEndX(15);
        line2.setEndY(16);
        System.out.println(line2);
        System.out.println("Begin X: " + line2.getBeginX());
        System.out.println("Begin Y: " + line2.getBeginY());
        System.out.println("End X: " + line2.getEndX());
        System.out.println("End Y: " + line2.getEndY());

        // Test getting and setting XY coordinates
        line1.setBeginXY(17, 18);
        line1.setEndXY(19, 20);
        System.out.println(line1);
        System.out.println("Begin XY: " + java.util.Arrays.toString(line1.getBeginXY()));
        System.out.println("End XY: " + java.util.Arrays.toString(line1.getEndXY()));

        // Test getLength and getGradient
        System.out.println("Length of line1: " + line1.getLength());
        System.out.println("Gradient of line1: " + line1.getGradient());
    }
}

