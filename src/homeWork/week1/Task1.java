import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the time from 0 to 24");
        int a = scanner.nextInt();
        if ((a >= 9) && (a <= 18)) {
            System.out.println("I am at work");
        } else {
            System.out.println("I rest");
        }
    }
}
