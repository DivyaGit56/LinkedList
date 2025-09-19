class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while(head != null){
            if(head.next != null && head.val == head.next.val){
                //duplicate found
                while(head.next != null && head.val == head.next.val){
                    head = head.next; // to capture all duplicate
                }
                prev.next = head.next;

            }else{
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
