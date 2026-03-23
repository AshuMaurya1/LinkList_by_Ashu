public class Hello {
    public static void PrintLinkedList(Node head){
        if(head == null){
            System.out.println("Null");
            return;
        }
        System.out.println(head.data + " ");
        PrintLinkedList(head.next);
    }
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        } 
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(10);
        Node c = new Node(10);
        Node d = new Node(10);
        Node e = new Node(10);
        Node f = new Node(10);
        Node g = new Node(10);

         a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        System.out.println(a);
    }
}