public class LeetCodeProblem25 {

    static ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k <= 1) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;

        while(true){
            ListNode kthNode = prevGroupEnd;
            for(int i = 0; i < k && kthNode != null; i++){
                kthNode = kthNode.next;
            }
            if(kthNode == null) break; // not enough nodes to reverse

            ListNode groupStart = prevGroupEnd.next;
            ListNode nextGroupStart = kthNode.next;

            // Reverse the current group
            ListNode prev = nextGroupStart;
            ListNode curr = groupStart;
            while(curr != nextGroupStart){
                ListNode nextCurr = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextCurr;
            }

            // Connect the previous group with the reversed current group
            prevGroupEnd.next = kthNode;
            prevGroupEnd = groupStart; // move to the end of the reversed group
        }
        return dummy.next;
    }
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
}