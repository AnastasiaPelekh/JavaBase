import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");
        int factorial = scanner.nextInt();
        int result = 1;
        for(int i = 1; i<=factorial; i++)
            result *= i;
            System.out.println("Factorial " + factorial + " = " + result );
            }
}
