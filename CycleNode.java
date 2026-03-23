public class CycleNode {

    static Node NodePoint(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }

        if(fast == null || fast.next == null){
            return null;
        }

        Node temp = head;
        while(temp != slow){
            temp = temp.next;
            slow = slow.next;
        }

        return slow;
    }

    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        } 
    }

    // static void Display(Node head){
    //     Node temp = head;
    //     while(temp != null){
    //         System.out.print(temp.data + " -> ");
    //         temp = temp.next;
    //     }
    //     System.out.print("Null");
    // }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        g.next = c;

        Node result = NodePoint(a);
        if(result != null){
            System.out.println("Cycle starts at: " + result.data);
        } else {
            System.out.println("No cycle found");
        }
    }
}