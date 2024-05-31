public class MyRectangle {
    private MyPoint2 topLeft;
    private MyPoint2 bottomRight;

    public MyRectangle(MyPoint2 topLeft, MyPoint2 bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public int getWidth() {
        return bottomRight.getX() - topLeft.getX();
    }

    public int getHeight() {
        return bottomRight.getY() - topLeft.getY();
    }

    public int getArea() {
        return getWidth() * getHeight();
    }

    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public String toString() {
        return "MyRectangle[topLeft=" + this.topLeft + ", bottomRight=" + this.bottomRight + "]";
    }
}