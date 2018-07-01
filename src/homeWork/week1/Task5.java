import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first value");
        int a = scanner.nextInt();
        System.out.println("Enter your two value");
        int b = scanner.nextInt();
        if(a>b){
            System.out.println("a-b = " + (a-b));
        }
        else{
            System.out.println("a*b = " + a*b);
        }
    }
}
