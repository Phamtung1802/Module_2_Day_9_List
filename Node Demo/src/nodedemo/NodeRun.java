package nodedemo;

public class NodeRun {
    public static void main(String[] args) {
        Node<String> head = null; //Danh sách bây giờ là rỗng
        Node<String> tail = null;

        head=new Node<>("Chicago");
        tail=head;
        tail.next=new Node<>("Denver");
        tail=tail.next;
        tail.next=new Node<>("Apple");
        tail=tail.next;
        tail.next=new Node<>("Good");
        tail=tail.next;
        tail.next=new Node<>("Bye");
        System.out.println(head.next.next.next.data);

//        Node current = head;
//        while(current != null){
//            System.out.println(current.data);
//            current = current.next;
//        }

    }
}
