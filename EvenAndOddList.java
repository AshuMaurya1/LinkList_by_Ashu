public class EvenAndOddList {

    static ListNode evenoddList(ListNode head){
        ListNode t1 = new ListNode(100);
        ListNode h1 = t1;

        ListNode t2 = new ListNode(200);
        ListNode h2 = t2;

        ListNode temp = head;
        int i = 1;

        while(temp != null){
            if(temp.val % 2 == 0){
                t1.next = temp;
                t1 = t1.next;
            } else {
                t2.next = temp;
                t2 = t2.next;
            }
            temp = temp.next;  
            i++;
        }
        t1.next = h2.next;
        t2.next = null;

        return h1.next;
    }

    static void Display(ListNode head){
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.print("Null");
    }
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }  
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(21);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(45);
        ListNode e = new ListNode(50);
        ListNode f = new ListNode(67);
        ListNode g = new ListNode(70);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        ListNode result = evenoddList(a);
        Display(result);
    }
}