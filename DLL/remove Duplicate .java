class Solution {
    Node removeDuplicates(Node headRef) {

        Node temp = headRef;

        while(temp != null && temp.next != null) {

            if(temp.data == temp.next.data) {

                Node nextNode = temp.next.next;

                temp.next = nextNode;

                if(nextNode != null) {
                    nextNode.prev = temp;
                }

            } else {
                temp = temp.next;
            }
        }

        return headRef;
    }
}
