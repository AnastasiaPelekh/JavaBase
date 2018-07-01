import java.util.Scanner;
//1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
//лить, является ли он прямоугольным. Ответ вывести в виде сообщения.
public class Task1extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your a");
        int a = scanner.nextInt();
        System.out.println("Enter your b");
        int b = scanner.nextInt();
        System.out.println("Enter your c");
        int c = scanner.nextInt();
        int result = (a*a)+(b*b);
        if (result==(c*c)){
            System.out.println("Rectangular triangle");
        }
        else {
            System.out.println("Not a rectangular triangle");
        }
    }
}
