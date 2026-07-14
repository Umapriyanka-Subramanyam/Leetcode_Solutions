// Last updated: 7/14/2026, 2:19:07 PM
class Solution {
    public int singleNumber(int[] nums) {
        int flag=0;
        for(int n : nums){
            flag=flag^n;
        }
        return flag;
    }
}