class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {

        Node temp1 = head;
        Node temp2 = head;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if(head == null) return ans;

        // Find last node
        while(temp2.next != null) {
            temp2 = temp2.next;
        }

        while(temp1 != temp2 && temp1.prev != temp2) {

            int s = temp1.data + temp2.data;

            if(s == target) {

                ArrayList<Integer> pair = new ArrayList<>();

                pair.add(temp1.data);
                pair.add(temp2.data);

                ans.add(pair);

                temp1 = temp1.next;
                temp2 = temp2.prev;
            }
            else if(s > target) {
                temp2 = temp2.prev;
            }
            else {
                temp1 = temp1.next;
            }
        }

        return ans;
    }
}
