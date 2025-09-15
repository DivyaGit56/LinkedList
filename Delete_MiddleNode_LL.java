class solution{
  Node deleteMiddle(Node head){
    if(head == null && head.next == null)return null;
    Node slow = head;
    Node fast = head;
    fast = head.next.next;  # to skip 1 step
      while(fast != null && fast.next != null){
      slow.next = slow.next.next;
      return head;
    }
  }
      
