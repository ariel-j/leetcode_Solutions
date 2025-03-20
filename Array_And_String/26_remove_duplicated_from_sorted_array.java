class Solution {
    public int removeDuplicates(int[] nums) {
        int counter= nums.length;
        for(int j=0; j<nums.length-1; j++){
            if(nums[j]==nums[j+1]){
               nums[j] = Integer.MIN_VALUE;
               counter--; 
            }
        }
        int goback =0;
        for(int j=0; j<nums.length; j++){
            if(nums[j]==Integer.MIN_VALUE){
                goback++;
            }
            else {
                 nums[j-goback] = nums[j];
            }
        }
        return counter;
    }
}


class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}

/*https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150*/