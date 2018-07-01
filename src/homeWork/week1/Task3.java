import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value");
        int a = scanner.nextInt();
        if(a%7==0){
            System.out.println("Doubles value = " + (a*2));
        }
    }
}
