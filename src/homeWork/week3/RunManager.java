package homeWork.week3;
import java.util.Scanner;


public class RunManager {
    private Scanner reader;
    private Manager manager;

    public RunManager(Scanner reader,Manager manager ){
        this.reader = reader;
        this.manager = manager;
    }
    public void addNewStudent(){
        System.out.println("Please enter the student first name");
        String firstName = reader.next();
        System.out.println("Please enter the student surname");
        String surname = reader.next();
        System.out.println("Please enter the student age");
        int age = reader.nextInt();
        System.out.println("Please enter the tudent id");
        int id = reader.nextInt();
        Student student = new Student(firstName, surname, age, id);
        manager.add(student);
    }
    public void removeByIdStudent(){
        System.out.println("Please enter the student's id you want to delete");
        int id = reader.nextInt();
        manager.removeById(id);
    }
    public void removeByIndexStudent(){
        System.out.println("Please enter the student's index you want to delete");
        int index = reader.nextInt();
        manager.removeByIndex(index);
    }
    public void searchByIdStudent(){
        System.out.println("Please enter the student id you want to find");
        int id = reader.nextInt();
        manager.searchId(id);
    }
    public void searchByFirstname(){
        System.out.println("Please enter the student first name you want to find");
        String firstName = reader.next();
        manager.searchByFirstName(firstName);
    }
}
