public class nthNodeDelete {

    static void nthnodedelete(Node head, int n) {
        Node fast = head;
        Node slow = head;
        for(int i = 1; i <= n; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
    }

 static class Node{ 
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(100);
        Node b = new Node(200);
        Node c = new Node(300);
        Node d = new Node(400);
        Node e = new Node(500);
        Node f = new Node(600);
        Node g = new Node(700);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        int n = 3;
        nthnodedelete(a, n);

        Node temp = a;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
}