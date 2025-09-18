class Solution {
  public static Node findtell(head){
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
            
        }
        return tail;
    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        ArrayList<ArrayList<Integer>>res = new ArrayList<>();
        if(head == null)return res;
        Node left = head;
        Node right = findtell(head);
        while(left != null && right != null && left != right && right.next != left){
            if(left.data+right.data == target){
                ArrayList<Integer>pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                res.add(pair);
                
                left = left.next;
                right = right.prev;
            }else if(left.data+right.data <target){
                left = left.next;
            }else{
                right = right.prev;
            }
        }
        return res;
    }
}
