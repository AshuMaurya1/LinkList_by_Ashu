public class Implementation {
    public static void printList(Node head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        System.out.print(head.data + " -> ");
        printList(head.next);
    }

    public static class Node {
        int data;
        Node next;
        public Node(int data) { this.data = data; }
    }

    public static class Linkedlist { 
        Node head = null;
        Node tail = null;
        int size = 0; // Keeping track of size makes insertions safer

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAt(int idx, int val) {
            if (idx == 0) {
                insertAtHead(val);
                return;
            }
            if (idx == size) {
                insertAtEnd(val);
                return;
            }
            if (idx < 0 || idx > size) {
                System.out.println("Invalid Index");
                return;
            }

            Node t = new Node(val);
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(10);
        ll.insertAtEnd(15);
        
        System.out.print("Original List: ");
        printList(ll.head);
        System.out.print("After Insertion: ");
        
        ll.insertAt(0, 100);
        printList(ll.head);

        System.out.println(" ");
        System.out.println(ll.size);

    }
}