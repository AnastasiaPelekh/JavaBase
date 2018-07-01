import java.util.Scanner;
// Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
//тельные заменить на 0.
public class Task2extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a = scanner.nextInt();
        System.out.println("Enter your two number");
        int b = scanner.nextInt();
        System.out.println("Enter your tree number");
        int c = scanner.nextInt();
        if(a>=0){
            System.out.println("a^3 = " + a*a*a);
        }
        else{
            System.out.println("a = 0");
        }
        if(b>=0){
            System.out.println("b^3 = " + b*b*b);
        }
        else{
            System.out.println("b = 0");
        }
        if(c>=0){
            System.out.println("c^3 = " + c*c*c);
        }
        else{
            System.out.println("c = 0");
        }
    }
}
