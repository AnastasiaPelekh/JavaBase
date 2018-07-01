import java.util.Scanner;
//Даны три числа A,B,C. Увеличить числа в два
//раза, если A+B+C>0, в противном случае заменить
//на нули.
public class Task13extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A");
        int a = scanner.nextInt();
        System.out.println("Enter B");
        int b = scanner.nextInt();
        System.out.println("Enter C");
        int c = scanner.nextInt();
        int result = a+b+c;
        if(result>0){
            System.out.println("A = " + (a*2) + " B = " + (b*2) + " C = " + (c*2));
        }
        else {
            System.out.println("A = 0 " + " B = 0" + " C = 0");
        }
    }
}
