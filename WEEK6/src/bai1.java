class Point2D {

    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

class Rectangle2D {
    private Point2D bottomLeft;
    private Point2D topRight;

    public Rectangle2D(Point2D bottomLeft, Point2D topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public double calculateArea() {
        double width = topRight.getX() - bottomLeft.getX();
        double height = topRight.getY() - bottomLeft.getY();
        return width * height;
    }

    public double calculatePerimeter() {
        double width = topRight.getX() - bottomLeft.getX();
        double height = topRight.getY() - bottomLeft.getY();
        return 2 * (width + height);
    }

    public void display() {
        System.out.println("Rectangle:");
        System.out.println("Bottom-left corner: ");
        bottomLeft.display();
        System.out.println("Top-right corner: ");
        topRight.display();
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

public class bai1 {
    public static void main(String[] args) {
        Point2D bottomLeft = new Point2D(2.0, 3.0);
        Point2D topRight = new Point2D(5.0, 7.0);

        Rectangle2D rectangle = new Rectangle2D(bottomLeft, topRight);

        rectangle.display();
    }
}
