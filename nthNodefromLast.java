// import Hello.Node;

public class nthNodefromLast {
    static Node nthNode(Node head, int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        temp = head;
        for(int i=1;i<m;i++){
            temp = temp.next;
        }
        return temp;
    }
    nthNodefromLast (Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i = 1; i <= n; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
    }
    static void DiplayNode(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public static class Node{
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

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // Node temp = nthNode(a, 4);
        // System.out.println(temp.data);
        DiplayNode(a);
    }
}