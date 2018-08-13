package homeWork.week7;

public class TestMyLinkedList {
    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.toStringLinked());
        // list.addPrepend(10);
        //System.out.println(list.toStringLinked());
        // list.removeByIndex(1);
        // System.out.println(list.toStringLinked());
        //list.clearList();
        // System.out.println(list.toStringLinked());
        //System.out.println("index value" + list.getByIndex(3));
        // list.removeByValue(5);
        //  System.out.println(list.toStringLinked());
        // list.addByIndex(9,0);
        //System.out.println(list.toStringLinked());
        //list.setByIndex(3,7);
        //System.out.println(list.toStringLinked());
    }

}


