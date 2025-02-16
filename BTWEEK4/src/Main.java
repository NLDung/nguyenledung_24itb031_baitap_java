import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num1: " );
        int a = sc.nextInt();
        System.out.print("num2: " );
        int b = sc.nextInt();
        System.out.print("Nhap phep toan +,-,*,/ =");
        String pheptinh = sc.next();
        switch (pheptinh) {
            case "+":
                System.out.println("Priss+ :" + (a + b));
                break;
             case "-":
                System.out.println("Priss- :" + (a - b));
                break;
            case "*":
                System.out.println("Priss* :" + (a * b));
                break;
            case "/":
                while (b == 0 ) { System.out.println("Loi. Vui long nhap num2: ");
                    b = sc.nextInt();
                } System.out.println("Priss/ :" + (a / b));
                break;
            default:
                System.out.println("loi");
        } sc.close();
    }
}