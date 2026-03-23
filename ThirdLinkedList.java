public class ThirdLinkedList {

    static void printLinkedList(Node head){
        if(head == null){
            System.out.print("Null");
            return;
        }
        System.out.print(head.data + " -> ");
        printLinkedList(head.next);
    }

    public static class LinkedList {

        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int val){
            Node temp = new Node(val);

            if(head == null){
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
    }
    static void DeleteAt(int idx){
        Node head = null;
        Node temp = head;
        for(int i = 0; i < idx-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        // size--;
    }

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);

        printLinkedList(ll.head);

        DeleteAt(3);
        printLinkedList(ll.head);

    }
}