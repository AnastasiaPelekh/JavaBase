import java.util.Scanner;
//Написать программу вычисления стоимости переговоров, если по суббо-
//там и воскресеньям предоставляется 20% скидка. Ввести продолжитель-
//ность разговора и день недели (цифра от 1 до 7).
public class Task10extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your time");
        double time = scanner.nextDouble();
        System.out.println("Enter your day");
        int day = scanner.nextInt();
        double min = 0.5;
        double result = min*time;
        double sale = result*0.2;
        switch(day){
            case 1:
                System.out.println("Monday price = " + result);
                break;
            case 2:
                System.out.println("Tuesday price = " + result);
                break;
            case 3:
                System.out.println("Wednesday price = " + result);
                break;
            case 4:
                System.out.println("Thursday price = " + result);
                break;
            case 5:
                System.out.println("Friday price = " + result);
                break;
            case 6:
                System.out.println("Saturday price % = " + (result -sale) );
                break;
            case 7:
                System.out.println("Sunday price % = " + (result -sale));
                break;
                default:
                    System.out.println("Wrong number");
        }
    }
}
