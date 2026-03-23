public class Hello2 {
    static void Display(Node head){
        if(head == null) return;
        // Display(head.next);
        System.out.print(head.data + " -> ");
        Display(head.next);
    }
    static void Display2(Node head){
        Node temp = head;
        while(temp != null){
            // temp = temp.next;
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        Node h = new Node(80);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        Display(a);
    }
}
