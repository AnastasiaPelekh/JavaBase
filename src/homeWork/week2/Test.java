package homeWork.week2;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        for (int j = 0; j < 20; j++) {
            ArrayWrapper.add(j);
        }
        for (int i = 0; i < 20; i++) {
            ArrayWrapper.add((int)(Math.random() * 100));
        }
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println(ArrayWrapper.getArr().length);
        // return element by index
        System.out.println("return element by index");
        System.out.println(ArrayWrapper.get(10));
        // copy of sorted array
        System.out.println("copy of sorted array");
        System.out.println(Arrays.toString(ArrayWrapper.sort()));
        //remove by index
        System.out.println("remove by index");
        ArrayWrapper.remove(7);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println();
        //remove by value
        System.out.println("remove by value");
        ArrayWrapper.removeByValue(10);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        //search by value
        System.out.println("search by value" );
        ArrayWrapper.search(5);
        // returns revers of array
        System.out.println("returns revers of array" );
        ArrayWrapper.revers();
        //returns sub array
        System.out.println("returns sub array");
        ArrayWrapper.revers();
        ArrayWrapper.subArray(5, 16);
        // returns sum of all elements
        System.out.println("returns sum of all elements");
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        ArrayWrapper.sum();
        // add whole array
        System.out.println("add whole array");
        int[] newArr = new int[]{14, 115, 121, 156};
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        ArrayWrapper.add(newArr);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        // add on specific position
        // if index greater then size -> throw ArrayIndexOutOfBoundsException
        System.out.println("add on specific position");
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        ArrayWrapper.add(2, 8);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        // prepend value
        System.out.println("prepend value");
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        ArrayWrapper.prepend(9);
        // set new value instead old value
        // if index greater then size -> throw ArrayIndexOutOfBoundsException
        System.out.println("set new value instead old value");
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        ArrayWrapper.set(4, 11);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        // search sub array
        System.out.println("search sub array");
        }
}
