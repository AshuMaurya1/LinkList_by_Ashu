package DoublyLinkList;

public class hello {

    // Insert at any index
    static ListNode inserListNode(ListNode head, int index, int val){
        ListNode t = new ListNode(val);

        // Case 1: Insert at head
        if(index == 0){
            t.next = head;
            if(head != null) head.prev = t;
            return t;
        }

        ListNode temp = head;

        // Move to (index - 1) position safely
        for(int i = 0; i < index - 1 && temp != null; i++){
            temp = temp.next;
        }

        // If index is out of bounds
        if(temp == null) return head;

        // Insert node
        t.next = temp.next;
        t.prev = temp;

        if(temp.next != null){
            temp.next.prev = t;
        }

        temp.next = t;

        return head;
    }

    static void DispalyRondom(ListNode random){
        ListNode temp = random;
        while(temp.prev != null){
            temp = temp.prev;
        }
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void Display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void Display2(ListNode tail){
        ListNode temp = tail;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    static class ListNode{
        int val;
        ListNode next;
        ListNode prev;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        ListNode a = new ListNode(4);
        ListNode b = new ListNode(10);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(99);
        ListNode e = new ListNode(13);
        ListNode f = new ListNode(13);

        // Linking nodes
        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
        d.next = e; e.prev = d;
        e.next = f; f.prev = e;

        // Display before insertion
        Display(a);

        System.out.println("Ashu Kumar Maurya");

        // Insert at index 3
        a = inserListNode(a, 3, 1000);

        // Display after insertion
        Display(a);

        // Reverse display
        Display2(f);
    }
}