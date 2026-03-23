public class FirstLinkList {

// Count Length Linkded List
    public static int Length(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }


    // Recursively Print LinkList Second Method
    public static void Dispalyr(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        Dispalyr(head.next);
    }

    // Print LinkList Using First Mothed
    public static void displayLisy(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static class Node {

        int data; // value
        Node next; // address of next node
        // private boolean nextext;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        Node f = new Node(11);
        Node g = new Node(12);

        a.next = b;
        b.next = c;
        c.next = d;

        d.next = e;
        e.next = f;
        f.next = g;

        // System.out.println(a.data);
        // System.out.println(b.data);
        // System.out.println(c.data);
        // System.out.println(d.data);
        // System.out.println(e.data);
        // System.out.println(f.data);
        // System.out.println(g.data);

//Print LinkList

        // Node temp = a;
        // // while(temp != null)  // Printing The List
        //     for(int i = 1; i <= 6; i++){
        //     System.out.print(temp.data + " -> ");
        //     temp = temp.next;
        // }


        displayLisy(a);   // First method calling
        Dispalyr(a);      // Second Method Colling
        int result = Length(a);
        System.out.println();
        System.out.println(result);
    }
}