package homeWork.week7;


public class MyLinkedList<T> {

    private Node<T> first;
    private Node<T> last;

    private int size;

    public void add(T value) {
        if (size == 0) {
            Node<T> tNode = new Node<>(null, null, value);
            first = tNode;
            last = tNode;
            size++;
            return;
        }

        Node<T> tNode = new Node<>(null, last, value);
        last.next = tNode;
        last = tNode;
        size++;
    }

    public void addPrepend(T value) {
        if (size == 0) {
            Node<T> tNode = new Node<>(null, null, value);
            first = tNode;
            last = tNode;
            size++;
            return;
        }
        Node<T> tNode = new Node<>(first, null, value);
        first.previous = tNode;
        first = tNode;
        size++;
    }


    public void addByIndex(T value, int index) {
        Node<T> newNode = new Node<>();
        newNode.value = value;

        Node<T> tNode = first;
        if (index == 0) {
            addPrepend(value);
        }
        for (int i = 1; ; i++) {
            if (tNode == null) {
                break;
            }
            if (i == index) {
                newNode.next = tNode.next;
                tNode.next = newNode;
                break;
            }
            tNode = tNode.next;
        }
    }

    public void clearList() {
        first = null;
        size = 0;
    }

    public void removeByValue(int value) {
        Node<T> tNode = first;
        int found = 0;
        if (tNode.value.equals(value)) {
            found = 1;
            first = first.next;
        } else {
            Node<T> tNode1 = first;
            while (tNode != null) {
                if (tNode.value.equals(value)) {
                    found = 1;
                    break;
                }
                tNode1 = tNode;
                tNode = tNode.next;
            }
            if (found == 1) {
                tNode1.next = tNode.next;
            }
        }
    }


    public void removeByIndex(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException();
        Node<T> tNode = first;
        if (index == 0) {
            first = first.next;
            return;
        }
        for (int i = 0; i < index - 1 && tNode != null; i++) {
            tNode = tNode.next;
        }
        if (tNode == null) {
            return;
        }
        tNode.next = tNode.next.next;
    }

    public T getByIndex(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        Node<T> tNode = first;
        while (index > 0) {
            tNode = tNode.next;
            index--;
        }
        return tNode.value;
    }


    public void setByIndex(int index, T value) {
        Node<T> tNode = first;
        for (int i = 0; i < index; i++) {
            tNode = tNode.next;
        }
        tNode.value = value;
    }


    private static class Node<T> {

        Node<T> next;
        Node<T> previous;
        T value;

        public Node() {
        }

        public Node(Node<T> next, Node<T> previous, T value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }

    }

    public String toStringLinked() {
        Node<T> tNode = first;
        StringBuilder sb = new StringBuilder("My Linked List: [");
        while (tNode != null) {
            sb = sb.append(tNode.value + " ");
            tNode = tNode.next;
        }
        return sb.append("]").toString();
    }


}
