import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first value");
        int a = scanner.nextInt();
        System.out.println("Enter your two value");
        int b = scanner.nextInt();
        int sum = a+b;
        if((11<=sum)&&(sum<=19)){
            System.out.println("Range sum from 11 to 19;Sum = " + sum);
        }
    }
}
