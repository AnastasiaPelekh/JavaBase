import java.util.Scanner;
//Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
//пара равных
public class Task5extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a = scanner.nextInt();
        System.out.println("Enter your two number");
        int b = scanner.nextInt();
        System.out.println("Enter your tree number");
        int c = scanner.nextInt();
        if((a==b)||(a==c)||(b==c)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
