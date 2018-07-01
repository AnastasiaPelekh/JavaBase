import java.util.Scanner;
public class Task12extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the wind speed");
        int wind = scanner.nextInt();
        if((wind<=4)&&(wind>=1)){
            System.out.println("Слабий вітер");
        }
        else if((wind>=5)&&(wind<=10)){
            System.out.println("Помірний вітер");
        }
        else if((wind>=11)&&(wind<=18)){
            System.out.println("Сильний вітер");
        }
        else if(wind==0){
            System.out.println("Вітру немає");
        }
        else{
            System.out.println("Ураганний вітер");
        }
    }
}
