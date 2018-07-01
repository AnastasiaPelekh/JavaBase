package homeWork.week2;
import java.util.Arrays;

public class ArrayWrapper {
    private static int[] arr = new int[10];
    private static int size = 0;

    public static void add(int num) {
        if (size >= arr.length) {
            extendArray();
        }
        arr[size++] = num;
    }

    private static void extendArray() {
        int[] newArr = new int[size << 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    public static int[] getArr() {
        return arr.clone();
    }


    // returns element by index
    public static int get(int index) {
        if (index < arr.length && index >= 0) {
            return arr[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }


    // copy of sorted array
    public static int[] sort() {
        int sorty;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - (i + 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    sorty = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = sorty;
                }
            }
        }
        return arr;
    }


    // remove by index
    public static void remove(int index) {

        if (index < arr.length) {
            int[] newArr = new int[arr.length - 1];
            System.arraycopy(arr, 0, newArr, 0, index);
            System.arraycopy(arr, index + 1, newArr, index, newArr.length - index - 1);
            arr = newArr;
            System.out.println("Remove");
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    // remove by value
    public static void removeByValue(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                remove(i);
                break;
            }
        }
    }

    // search by value
    public static boolean search(int value) {
        boolean isBool = false;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                isBool = true;
                break;
            }
        }
        if (isBool == true) {
            System.out.println("True ");
        } else if (isBool == false) {
            System.out.println("False");
        }
        return isBool;
    }

    // returns revers of array
    public static int[] revers() {
        for (int i = 0; i < arr.length / 2; i++) {
            int result = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = result;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    // returns sub array
    public static int[] subArray(int start, int end) {
        int[] sub = new int[end - start];
        System.arraycopy(arr, 0, sub, 0, end - start);
        System.out.println(Arrays.toString(sub));
        return arr = sub;
    }

    // returns sum of all elements
    public static int sum() {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println("Sum of all elements = " + result);
        return result;
    }

    // add whole array
    public static void add(int[] newArr) {
        int[] isArr = new int[arr.length + newArr.length];
        System.arraycopy(arr, 0, isArr, 0, arr.length);
        System.arraycopy(newArr, 0, isArr, arr.length, newArr.length);
        arr = isArr;
    }

    // add on specific position
    // if index greater then size -> throw ArrayIndexOutOfBoundsException
    public static void add(int index, int value) {
        int[] res = new int[arr.length + 1];
        if (index > arr.length || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.arraycopy(arr, 0, res, 0, index);
        System.arraycopy(arr, index, res, index + 1, res.length - index - 1);
        res[index] = value;
        arr = res;
    }
    // prepend value
    public static void prepend(int num) {
        int[] mass = new int[arr.length + 1];
        System.arraycopy(arr, 0, mass, 1, arr.length);
        mass[0] = num;
        arr = mass;
    }
    // set new value instead old value
    // if index greater then size -> throw ArrayIndexOutOfBoundsException
    public static int set(int index, int value) {
        if(index > arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int old = arr[index];
        arr[index] = value;
        return old;
    }
    // search sub array
    public static int searchSubArray(int[] subArray){
        return 0;
    }




}


