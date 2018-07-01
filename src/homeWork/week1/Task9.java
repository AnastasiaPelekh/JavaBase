import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");
        int num1 = scanner.nextInt();
        int res = 0;
        while(num1!=0){
            int c = num1%10;
            num1 = num1/10;
            if(c == 5){
              res = res + 1;
            }
        }
        System.out.println("Number 5 in a given value = " + res);
        }
        }



