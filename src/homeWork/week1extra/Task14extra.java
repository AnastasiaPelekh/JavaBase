import java.util.Scanner;
//Определить, является ли шестизначное число "счастливым" (сумма
//первых трех цифр равна сумме последних трех цифр).
public class Task14extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 6 number ");
        int a = scanner.nextInt();
        int s = a%10;
        int r = a%100;
        int r1 = r/10;
        int k = a%1000;
        int k1 = k/100;
        int sum1 = k1+r1+s;
        int h = a%10000;
        int h1 = h/1000;
        int m = a%100000;
        int m1 = m/10000;
        int x = a%1000000;
        int x1 = a/100000;
        int sum2 = x1+m1+h1;
        boolean res = (sum1==sum2);
        System.out.println("Happy ticket: " + res);
    }
}
