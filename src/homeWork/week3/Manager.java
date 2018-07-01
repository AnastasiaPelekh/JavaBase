package homeWork.week3;
import java.util.Arrays;
import java.util.Scanner;

public class Manager {
    static Student[]arr = new Student[1];
    static int size = 0;

        public Manager(){

            }
        public Manager(Student[] arr){
            this.arr = arr;
        }

        public static Student[] getArr() {
            return arr;
        }

        public static void setArr(Student[] arr) {
            Manager.arr = arr;
        }
        public static void sizeListStudent (int size){
        Student[]newArr = new Student[size];
        arr = newArr;
        }
        public  void add(Student student) {
            if (size >= arr.length) {
                extendArray();
            }
            arr[size++] = student;
            student.setId(size);
        }

        public void extendArray(){
            Student[]newArr = new Student[size + 1];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
    }
        public void removeById(int id){
        for(int i = 0;i < arr.length; i++){
            if(id == arr[i].getId()){
                removeById(i);
                break;
            }
        }
    }
        //показує лист
        public Student[] getArrClone() {
            return arr.clone();
        }
        public void searchId(int id){
        for (int i = 0;i < arr.length;i++){
        if(id == arr[i].getId() ){
            System.out.println(arr.toString());
            }
        }
        }
       public void removeByIndex(int index){
        Student[]newArr = new Student[arr.length - 1];
        System.arraycopy(arr, 0, newArr, 0, index);
        System.arraycopy(arr, index + 1, newArr, index, newArr.length - index - 1);
        arr = newArr;
       }
       public Manager searchByFirstName(String firstName){
            Manager newManager = new Manager();
            for (int i = 0;i < arr.length;i++){
                if(firstName == arr[i].getFirstName()){
                    newManager.add(arr[i]);
                }
            }
            return newManager;
       }




}
