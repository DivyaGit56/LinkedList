class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        // find gola index
        int gola_idx = -1;
        for(int i = n-1; i>0; i--){
            if(nums[i]>nums[i-1]){
                gola_idx = i-1;
                break;
            }
        }

        //if no gola idx is found then we need to reverse whole array

        if(gola_idx == -1){
            int l = 0, r = n-1;
            while(l<r){
                int temp = nums[l];
                nums[l]  = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
            return;
        }

    // if gola idx is found, we try to find swap idx
    if(gola_idx != -1){
        int swap_idx = gola_idx;
        for(int j = n-1; j>= gola_idx; j--){
           if(nums[j]>nums[gola_idx]){
            swap_idx = j;
            break;
           }
        }
        // swap gola_idx and swap_idx

        int temp = nums[gola_idx];
        nums[gola_idx] = nums[swap_idx];
        nums[swap_idx] = temp;
      // reverse after gola idx
    }
      int left = gola_idx+1,right = n-1;
      while(left<right){
        int t = nums[left];
        nums[left] = nums[right];
        nums[right] = t;
        left++;
        right--;
      
    }

        
    }
}
