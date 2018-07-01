import java.util.Scanner;
// Дано натуральне число А > 1. Вирахувати яким по рахунку числом Фібоначі воно являється.
//  Тобто введіть так число n , щоб φn=A.Якшо А не являєтся числом Фібоначі, виведіть число -1.
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value A");
        int n = scanner.nextInt();
        int a = 1;
        int b = 1;
        int fib = 2;
        int i = 2;
        int k = 0;
        while (i < n) {
            fib = a + b;
            a = b;
            b = fib;
            i++;
            if(fib == n){
                System.out.println("Your number : " + i);
            }
            }
        if(fib!=n){
            System.out.println("-1");
        }
    }
}
