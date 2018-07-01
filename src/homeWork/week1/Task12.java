import java.util.Scanner;
//Вирахувати число фібоначі по номеру послідовності, який вводить користувач.φn=φn-1+φn-2.
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value n");
        int num = scanner.nextInt();
        int a = 1;
        int b = 1;
        int fib = 2;
        int i = 2;
        while (i < num) {
            fib = a + b;
            a = b;
            b = fib;
            i++;
            }
        System.out.println("Your number = " + fib);

    }
}
