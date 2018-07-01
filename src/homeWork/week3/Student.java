package homeWork.week3;

public class Student {
    private String firstName;
    private String surname;
    private int age;
    private int id;

    public Student(String firstName, String surname, int id, int age){
        this.firstName = firstName;
        this.surname = surname;
        this.id = id;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return this.firstName + " " + this.surname + " " + this.age + " " + this.id;
    }
}
