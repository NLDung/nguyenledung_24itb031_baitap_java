import java.util.Scanner;

class Student {

    private String name;
    private int age;
    private String address;
    private double[] marks;

    public Student(String name, int age, String address, double[] marks) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.marks = marks;
    }

    public double calculateAverage() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total / marks.length;
    }

    public void displayInfo() {
        System.out.println("Thông tin học sinh:");
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
        System.out.print("Điểm các môn: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        System.out.println("Điểm trung bình: " + calculateAverage());
    }
}

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên học sinh: ");
        String name = scanner.nextLine();

        System.out.print("Nhập tuổi học sinh: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập địa chỉ học sinh: ");
        String address = scanner.nextLine();

        System.out.print("Nhập số môn học: ");
        int numberOfSubjects = scanner.nextInt();

        double[] marks = new double[numberOfSubjects];

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Nhập điểm môn thứ " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }

        Student student = new Student(name, age, address, marks);
        student.displayInfo();

        scanner.close();
    }
}
