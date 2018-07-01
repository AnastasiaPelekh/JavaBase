package homeWork.week3;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Manager menu = new Manager();
        Scanner out = new Scanner(System.in);
        RunManager runManager = new RunManager(out, menu);

        while (true) {
            firstWindow();
            String choise = out.next();
            switch (choise) {
                case "1":
                    runManager.addNewStudent();
                    System.out.println("DONE!");
                    System.out.println(Arrays.toString(Manager.getArr()));
                    break;
                case "2":
                    runManager.removeByIdStudent();
                    System.out.println("DONE!");
                    System.out.println(Arrays.toString(Manager.getArr()));
                    break;
                case "3":
                    runManager.removeByIndexStudent();
                    System.out.println("DONE!");
                    System.out.println(Arrays.toString(Manager.getArr()));
                    break;
                case "4":
                    runManager.searchByIdStudent();
                    System.out.println(Arrays.toString(Manager.getArr()));
                    break;
                case "5":
                    runManager.searchByFirstname();
                    System.out.println(Arrays.toString(Manager.getArr()));
                    break;
                case "6":
                    System.out.println("Student catalog");
                    System.out.println(Arrays.toString(Manager.getArr()));
                    break;
                case "0":
                    System.out.println("Goodbye mr.Admin!");
                    break;
            }

        }
    }
    static void firstWindow () {
        System.out.println();
        System.out.println("<<<<<<<<Hello Admin>>>>>>>>");
        System.out.println();
        System.out.println("Enter a digit to complete an action:\n>1 - Add student\n>2 - Remove student by id\n>3 - Remove student by index\n>4 - Search student by id\n>5 - Search student by first name\n>6 - Show student list\n>0 - Exit");
    }
}

