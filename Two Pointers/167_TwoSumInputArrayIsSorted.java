
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a =0,b=numbers.length-1;
       while(numbers[a]+numbers[b] != target){
            if(numbers[a]+numbers[b]<target) {
                a++;
            }
            else
                b--;  
        }
        int[] ans1 = {a+1,b+1};
        return ans1;
    }
}
/*
 * 
From <https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/?envType=study-plan-v2&envId=top-interview-150> 
 */