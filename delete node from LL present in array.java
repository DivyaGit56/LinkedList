class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer>st = new HashSet<>();

        for(int num : nums){
            st.add(num);
        }
        // if  start node of list present in set
        while(head != null && st.contains(head.val)){
            head = head.next;
        }
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            if(! st.contains(curr.val)){
                prev = curr;
                curr = curr.next;
            }else{
                // skip current node
                if(prev != null){
                    prev.next = curr.next;

                }
                curr = curr.next;
            }
        }
            return head;
        }
    }

        
        
    
