import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first value");
        int a = scanner.nextInt();
        System.out.println("Enter your two value");
        int b = scanner.nextInt();
        System.out.println("Enter your tree value");
        int c = scanner.nextInt();
        int result1 = Math.max(a, b);
        int result2 = Math.max(result1, c);
        int result3 = Math.min(a, b);
        int result4 = Math.min(result3, c);
        System.out.println("Max = " + result2 + " Min = " + result4);
    }
}
