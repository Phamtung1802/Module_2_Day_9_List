package linkedlist;

public class Node<E> {

    public Node next;
    public Object Data;

    public Node(E e) {
        Data = e;
    }
    public Object getData() {
        return Data;
    }
}
