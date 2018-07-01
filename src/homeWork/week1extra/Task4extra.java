import java.util.Scanner;
//Известны две скорости, одна в километрах в час, другая в метрах в секун-
//ду. Какая из них больше?
public class Task4extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Speed kilometer per hour");
        double a = scanner.nextDouble();
        System.out.println("Speed meters per second");
        double b = scanner.nextDouble();
        double km = (double)1000/3600;
        double result = a*km;
        if (result>b){
            System.out.println("a " + result + " > " + " b " + b);
        }
        else{
            System.out.println("b " + b + " > " + " a " + result);
        }
    }
}
