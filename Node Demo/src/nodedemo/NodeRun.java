package nodedemo;

public class NodeRun {
    public static void main(String[] args) {
        Node<String> head = null; //Danh sách bây giờ là rỗng
        Node<String> tail = null;
        Node soDauTien = new Node<>( 1.9);
        System.out.println(soDauTien.element);
        head=new Node<>("Chicago");
        tail=head;
        tail.next=new Node<>("Denver");
        tail=tail.next;
        tail.next=new Node<>("Apple");
        tail=tail.next;
        tail.next=new Node<>("Good");
        tail=tail.next;
        tail.next=new Node<>("Bye");

        Node current = head;
        while(current != null){
            System.out.println(current.element);
            current = current.next;
        }
    }
}
