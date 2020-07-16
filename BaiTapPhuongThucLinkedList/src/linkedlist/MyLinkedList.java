package linkedlist;

public class MyLinkedList<E> {
    Node head = null;
    Node tail = null;
    private int size;
    public Node Head;
    int numNodes;

    public void addFirst(E e) {
        Node newNode = new Node<E>(e);
        newNode.next = head;
        head = newNode;
        size++;

        if (tail == null)
            tail = head;
    }

}
