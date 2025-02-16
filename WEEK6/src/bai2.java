import java.awt.Color;

class Point2D2 {  // Đổi tên lớp từ Point2D thành Point2D2
    private double x;
    private double y;

    public Point2D2(double x, double y) {  // Cập nhật constructor
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
        System.out.println("Điểm: (" + x + ", " + y + ")");
    }
}

class Circle2D {
    private double radius;
    private Color color;
    private Point2D2 center;  // Thay Point2D thành Point2D2

    public Circle2D(Point2D2 center, double radius, Color color) {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Point2D2 getCenter() {  // Thay Point2D thành Point2D2
        return center;
    }

    public void setCenter(Point2D2 center) {
        this.center = center;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Hình tròn:");
        System.out.println("Điểm trung tâm: ");
        center.display();
        System.out.println("Bán kính: " + radius);
        System.out.println("Màu sắc: " + color);
        System.out.println("Diện tích: " + calculateArea());
        System.out.println("Chu vi: " + calculateCircumference());
    }
}

public class bai2 {  // Lớp chính vẫn là bai2
    public static void main(String[] args) {
        Point2D2 center = new Point2D2(5.0, 5.0);  // Cập nhật việc khởi tạo đối tượng
        Circle2D circle = new Circle2D(center, 3.0, Color.RED);
        circle.display();
    }
}
