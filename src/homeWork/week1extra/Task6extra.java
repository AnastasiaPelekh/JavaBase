import java.util.Scanner;
//У вас есть скорость и растояние, за какое время вы приедете в пукт назначания
public class Task6extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your speed");
        double s = scanner.nextDouble();
        System.out.println("Enter your distance");
        double v = scanner.nextDouble();
        double time = v/s;
        System.out.println("Time = " + time + " hour 20" );
        }
}
