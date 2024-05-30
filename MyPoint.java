package ifiyemi_QAP2JAVA;

public class MyPoint {
    private int x;
    private int y;

    
    // no argument Constructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // parameterized Constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter & Setter Method
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    // toString method
    public String toString() {
        return ("(" + this.x + "," + this.y + ")");
    }

    // Method to calculate the distance to another MyPoint
    public double distance(MyPoint p) {
        int xDiff = this.x - p.x;
        int yDiff = this.y - p.y;
        return (Math.sqrt(xDiff * xDiff + yDiff * yDiff));
    }
}
