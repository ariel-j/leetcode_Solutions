class Solution {
    public int removeElement(int[] nums, int val) {
        int i = nums.length;
        for(int j=0; j<nums.length; j++){
            if(nums[j]==val){
                while(nums[j]==val){i--;}
                nums[j]=nums[i--];
            }
        }
            return i;
        }
        /*int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;*/
    }



/*
 * ==================================================================
 * better solution:
 * 
 */

 class Solution1 {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
/*
 * https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
 */