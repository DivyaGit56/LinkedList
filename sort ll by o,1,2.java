class Solution {
    public Node segregate(Node head) {
        // code here
        Node zeroH = new Node(0);
        Node oneH = new Node(0);
        Node TwoH = new Node(0);
        
        Node zero = zeroH;
        Node one = oneH;
        Node two = TwoH;
        
        Node temp = head;
        
        while(temp != null){
            if(temp.data == 0){
                zero.next = temp;
                zero = zero.next;
            }else if(temp.data == 1){
                one.next = temp;
                one = one.next;
            }else{
                two.next = temp;
                two = two.next;
            }
            temp= temp.next;
        }
        
        zero.next = (oneH.next != null)?oneH.next:TwoH.next;
        
        one.next = TwoH.next;
        two.next = null;
        
        return zeroH.next;
        
    }
}
