package DoublyLinkList;

public class CircularLinkedList {
    static ListNode Display(ListNode head){
        ListNode temp = head.next;
        while(temp != head){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println( );
        return head;
    }
 
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        ListNode f = new ListNode(60);
        ListNode g = new ListNode(70);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = a;

        Display(a);
    }
}