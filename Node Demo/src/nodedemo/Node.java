package nodedemo;

public class Node<E> {
    E data;
    Node<E> next;
    public Node(E e) {
        data = e;
    }
}
