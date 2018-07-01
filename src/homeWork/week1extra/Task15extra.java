import java.util.Scanner;
//Известны площади круга и квадрата. Определить: а) уместится ли круг в
//квадрат; б) уместится ли квадрат в круге.
public class Task15extra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle area");
        double circle = scanner.nextDouble();
        System.out.println("Enter square area");
        double square = scanner.nextDouble();
        double p = 3.14;
        double r = Math.sqrt(circle/p);
        double d =r*2;
        double areas= Math.sqrt(square);
        double diagsq = Math.sqrt((areas*areas)+(areas*areas));
        if(d<=areas){
            System.out.println("The circle will fit into the square");
        }
        else{
            System.out.println("the circle does not fit into the square");
        }

        if(d<=diagsq){
            System.out.println("The square is placed in a circle");
        }
        else {
            System.out.println("The square does not fit into the circle");
        }

    }
}
