class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        // code here
        //  ALWAYS REMEMBER THAT MAP WILL CONTAIN NODE IDENTITY , ONLY IF IDENTITY 
        // IS EQUAL THEN IT IS CONSIDERED EQUAL
        
        HashMap<Node,Boolean>mp = new HashMap<>();
        
        Node temp = head1;
        
        while(temp != null){
            mp.put(temp,true);
            temp = temp.next;
        }
        
        Node temp2 = head2;
        while( temp2 != null){
            if(mp.containsKey(temp2)){
                return temp2;
            }
            temp2 = temp2.next;
        }
        return null;
        
        // APPROACH-2
        
        Node t1 = head1;
        Node t2 = head2;
        
        while ( t1 != t2){
            t1 = t1.next;
            t2 = t2.next;
        
        
        if(t1 == t2) return t1;
        if(t1 == null) t1 = head2;
        if(t2 == null) t2 = head1;
        
        
        }
        return t1;
    }
}
