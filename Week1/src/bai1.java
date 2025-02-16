import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sin,cos,canbac2;
        canbac2 = Math.sqrt(n);
        double x = n* 3.14/ 180;
        sin = Math.sin(x);
        cos = Math.cos(x);
        System.out.println(sin);
        System.out.println(cos);
        System.out.println(canbac2);
    }
}
