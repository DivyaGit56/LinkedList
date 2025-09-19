class Solution {
    Node removeDuplicates(Node head) {
        // Code Here.
        Node temp = head;
        while(temp != null){
            Node nextNode = temp.next;
            while(nextNode != null && nextNode.data == temp.data){
                nextNode = nextNode.next;
                
            }
            temp.next = nextNode;
            if(nextNode != null)nextNode.prev = temp;
            temp = temp.next;
        }
        return head;
    }
    
}
