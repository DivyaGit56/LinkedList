class Solution {
    
    public int findlength(Node slow,Node fast){
         int count = 1;
        fast = fast.next;
        
        while(slow != fast){
            count++;
            fast = fast.next;
        }
        return count;
    }
    public int lengthOfLoop(Node head) {
        // code here
        if(head == null)return 0;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
            return findlength(slow,fast);
            }
        }
        return 0;
    }
    
}
