class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenStart = even;
        while(odd.next != null && even.next != null){
            odd.next = even.next;
            odd = even.next;
            if(odd != null){ 
                even.next = odd.next;  // for avoid null pointer exception
                even = odd.next;
            }
        }
        odd.next = evenStart;  // connect end of odd list to even
        return head;
    }
}
