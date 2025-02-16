import java.util.Scanner;

class CompanyInfo {

    private String name;
    private String address;
    private double cost;
    private double income;
    private double benefit;

    public CompanyInfo(String name, String address, double cost, double income) {
        this.name = name;
        this.address = address;
        this.cost = cost;
        this.income = income;
        this.benefit = calculateBenefit();
    }

    public double calculateBenefit() {
        return income - cost;
    }

    public void displayInfo() {
        System.out.println("Thông tin công ty:");
        System.out.println("Tên công ty: " + name);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Chi phí: " + cost);
        System.out.println("Thu nhập: " + income);
        System.out.println("Lợi nhuận: " + benefit);
    }
}

public class bai6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên công ty: ");
        String name = scanner.nextLine();

        System.out.print("Nhập địa chỉ công ty: ");
        String address = scanner.nextLine();

        System.out.print("Nhập chi phí công ty: ");
        double cost = scanner.nextDouble();

        System.out.print("Nhập thu nhập công ty: ");
        double income = scanner.nextDouble();

        CompanyInfo company = new CompanyInfo(name, address, cost, income);

        company.displayInfo();

        scanner.close();
    }
}
