import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first value");
        double a = scanner.nextDouble();
        System.out.println("Enter your two value");
        double b = scanner.nextDouble();
        double res = Math.max(a, b);
        double res2 = Math.min(a, b);
        if(a==0||b==0){
            System.out.println("True. = " + 0);
        }
        else if((res%res2==0)){
            System.out.println("True" + res + "/" + res2 + "=" + res/res2);
        }
        else{
            System.out.println("False. " + res + "/" + res2 + " = " + res/res2);
        }
        }
    }


