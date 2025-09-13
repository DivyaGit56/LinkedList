class result{
  public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
    // Write your code here
    if(llist == null || llist.next == null)
    return llist;
    SinglyLinkedListNode newllist = reverse(llist.next);
    SinglyLinkedListNode front = llist.next;
    front.next = llist;
    llist.next = null;
    return newllist;
  }
}
