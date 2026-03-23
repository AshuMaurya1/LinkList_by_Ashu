public class ReverseList {

    static ListNode reverse(ListNode head){ // recursive approach
        if(head == null || head.next == null) return head;
        ListNode newHead = reverse(head.next);
        head.next.next = head; //interchanging the connections
        head.next = null; // FIXED LINE
        return newHead;
    } 

    static ListNode reverseIterativaApproach(ListNode head){ //iterative Approach
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextcurr = curr.next; // store the next node
            curr.next = prev; // reverse the current node's pointer
            prev = curr; // move prev to the current node
            curr = nextcurr; // move to the next node
        }
        return prev;
    }

    static void Display(ListNode head){
        if(head == null) return;
        System.out.print(head.val + " -> ");  
        Display(head.next);
    }
    // static void Display(ListNode head){
    //     while(head != null){
    //         System.out.print(head.val + " -> ");
    //         head = head.next;
    //     }
    //     System.out.print("Null");
    // }
    static  class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(11);
        ListNode b = new ListNode(12);
        ListNode c = new ListNode(13);
        ListNode d = new ListNode(14);
        ListNode e = new ListNode(15);
        ListNode f = new ListNode(16);
        ListNode g = new ListNode(17);
        ListNode h = new ListNode(18);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;

        Display(a);
        System.out.print("Null\n");

        a = reverseIterativaApproach(a);

        Display(a);
        System.out.print("Null");
    }
}