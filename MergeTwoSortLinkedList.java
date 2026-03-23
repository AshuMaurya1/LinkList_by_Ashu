public class MergeTwoSortLinkedList {

    static ListNode1 mergeTwoLists(ListNode1 l1, ListNode1 l2) {
        ListNode1 h = new ListNode1(500000);
        ListNode1 t = h;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                t.next = l1;
                l1 = l1.next;
            } else {
                t.next = l2;
                l2 = l2.next;  
            }
            t = t.next;
        }

        if (l1 != null) t.next = l1;
        if (l2 != null) t.next = l2;

        return h.next;
    }

    static void Display(ListNode1 head){
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("Null");
    }

    static class ListNode1 {
        int val;
        ListNode1 next;
        public ListNode1(int val) { this.val = val; }
    }

    public static void main(String[] args) {
        ListNode1 a = new ListNode1(1);
        ListNode1 b = new ListNode1(3);
        ListNode1 c = new ListNode1(5);
        ListNode1 h = new ListNode1(6);
        a.next = b;
        b.next = c;
        c.next = h;

        // Second list (now also ListNode1)
        ListNode1 d = new ListNode1(2);
        ListNode1 e = new ListNode1(4);
        ListNode1 f = new ListNode1(6);
        ListNode1 g = new ListNode1(6);
        d.next = e;
        e.next = f;
        f.next = g;

        Display(a);
        Display(d);

        ListNode1 result = mergeTwoLists(a, d);
        System.out.println("Merged list:");
        Display(result);
    }
}