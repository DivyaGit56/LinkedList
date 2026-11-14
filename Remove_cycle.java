class Solution {
    public static void removeLoop(Node head) {
        // code here
      Node fast = head;
      Node slow = head;
      
      while(fast != null && fast.next != null){
          fast = fast.next.next;
          slow = slow.next;
          
          if(slow == fast){
              break;
          }
      }
    //   if no loop
      if(fast == null || fast.next == null)return; 
      slow = head;
      
      if(slow == fast){
          // if loop start from head
          while(fast.next != slow){
              fast = fast.next;
          }
      }else{
          while(fast.next != slow.next){
              fast = fast.next;
              slow = slow.next;
          }
      }
      fast.next = null;
    }
}
