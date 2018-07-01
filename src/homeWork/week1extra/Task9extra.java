import java.util.Scanner;
//Написать программу вычисления идеального веса пользователя (рост-
//100). Выдать рекомендации о необходимости поправиться либо поху-
//деть.
public class Task9extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your growth");
        int gr = scanner.nextInt();
        System.out.println("Enter your weight");
        int wei = scanner.nextInt();
        int perfect = (gr-100);
        if(perfect>wei){
            System.out.println("It is worth gaining weight");
        }
        else if (perfect==wei){
            System.out.println("You weight is perfect");
        }
        else{
            System.out.println("It's worth losing weight");
        }
    }
}
