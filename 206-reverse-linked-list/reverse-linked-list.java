
                            



class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode p = null;
        ListNode c = head;
        while(c != null){
            ListNode y = c.next;
            c.next = p;
            p = c;
            c = y;
        }
        return p;
    }
}