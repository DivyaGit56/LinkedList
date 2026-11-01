class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        // if(head == null || head.next == null){
        //     return null;
        // }
        
        Node temp = head;
        Node newHead= null;
        while(temp != null){
            
            // Reverse Links
            
            Node swap = temp.next;
            temp.next = temp.prev;
            temp.prev = swap;
            
            // head update
            
            newHead =temp;
            // move in original direction
            
            temp = temp.prev;
            
        }
            // if(head != null){
            //     head = head.prev;
            // }
        
        return newHead;
    }
}
