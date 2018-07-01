import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value");
        double a = scanner.nextDouble();
        int b = (int)a;
        if ((0 >= b)&&(b <= 1)) {
            System.out.println("Range from 0 to 1: True");
        } else {
            System.out.println("Range from 0 to 1: False");
        }
    }
}
