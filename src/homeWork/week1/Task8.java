import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first value");
        int a = scanner.nextInt();
        System.out.println("Enter your two value");
        int b = scanner.nextInt();
        int result = a%10;
        int result2 = b%10;
        boolean isRes = result==result2;
        System.out.println(a + "==" + b + " - " + isRes);
        }
}
