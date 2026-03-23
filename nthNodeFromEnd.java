public class nthNodeFromEnd {

    // public static Node nthNode(Node head, int n) {
    //     int size = 0;
    //     Node temp = head;

    //     while (temp != null) {
    //         size++;
    //         temp = temp.next;
    //     }

    //     if (n > size) return null;

    //     int m = size - n + 1;

    //     temp = head;

    //     for (int i = 1; i < m; i++) {
    //         temp = temp.next;
    //     }

    //     return temp;
    // }
    public static Node nthNode(Node head, int n){
        Node fast = head;
        Node slow = head;
        for(int i = 1; i <= n; i++){
            fast = fast.next;
        }
        while(fast != null){
        fast = fast.next;
        slow = slow.next;
        }
        return slow;
    }

    static class Node { 
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

        Node temp = nthNode(a, 3);

        if (temp != null)
            System.out.println(temp.data);
        else
            System.out.println("Invalid n");
    }
}