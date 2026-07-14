// Last updated: 7/14/2026, 2:18:53 PM
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
       int count =0;
       while(left!=right){
        left>>=1;
        right>>=1;
        count++;
       } 
       return(left<<count);
    }
}