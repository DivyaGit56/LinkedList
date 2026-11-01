class Solution {
    public int Length(Node slow,Node fast){
        int cnt =1;
        fast = fast.next;
        
        while(slow != fast){
            cnt++;
            fast = fast.next;
        }
        return cnt;
    }
    public int lengthOfLoop(Node head) {
        if (head == null || head.next == null) {
            return 0;
        }

        // code here
        
        Node slow = head;
        Node fast = head;
        
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return Length(slow,fast);
            }
        }
        return 0;
    }
}
