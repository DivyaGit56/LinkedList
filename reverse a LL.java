class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node temp = null;
        Node curr = head;
        Node newHead = null;
        
        while(curr != null){
            Node next = curr.next;
            curr.next = temp;
            temp = curr;
            curr = next;
            
            newHead = temp;
        }
        return newHead;
    }
}
