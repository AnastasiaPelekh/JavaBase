import java.util.Scanner;
//Написать программу, которая при вводе числа в диапазоне от 1 до 99
//добавляет к нему слово "копейка" в правильной форме. Например, 1
//копейка, 5 копеек, 42 копейки .
public class Task11extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value(1 - 99)");
        int money = scanner.nextInt();
        int z = money%10;
        if(z==1) {
            System.out.println(money + " Копійка");
        }
        else if((z==2)||(z==3)||(z==4)){
            System.out.println(money + " Копійки");
        }
        else {
            System.out.println(money + " Копійок");
        }


    }
}
