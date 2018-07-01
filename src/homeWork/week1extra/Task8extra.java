import java.util.Scanner;
/*Обчислити вартість покупки з урахуванням знижки. Знижка в 10% предос-
тавляется, якщо сума покупки перевищує 1000 гривень.*/
public class Task8extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your summ");
        double summ = scanner.nextDouble();
        double sale = summ*0.1;
        if(summ>1000){
            System.out.println("The cost of a purchase with a discount = " + (summ-sale) );
        }
        else{
            System.out.println("Purchase cost");
        }
    }
}
