
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int a=0, b=s.length()-1;
        for(int i=0; i<s.length()/2; i++){
            if(!(s.charAt(a)==s.charAt(b)))
                return false;
            a++;
            b--;
        }
        return true;
    }
}

/*
 * From <https://leetcode.com/problems/valid-palindrome/description/?envType=study-plan-v2&envId=top-interview-150> 
 */