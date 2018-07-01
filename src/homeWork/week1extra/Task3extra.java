import java.util.Scanner;
//Дано трехзначное число. Определить: а) верно ли, что все его цифры
//одинаковые; б) есть ли среди его цифр одинаковые.
public class Task3extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your three-digit number");
        int value = scanner.nextInt();
        int a = value % 10;
        int b = value % 100;
        int b2 = b / 10;
        int c = value % 1000;
        int c2 = c / 100;
        if ((a == b2)&&(a==c2)) {
            System.out.println("All numbers are the same: True");
        } else {
            System.out.println("All numbers are the same: False");
        }
        if((a==b2)||(a==c2)||(b2==c2)){
            System.out.println("Some numbers are the same: True");
        }
        else{
            System.out.println("Some numbers are the same: False");
        }

    }
}
