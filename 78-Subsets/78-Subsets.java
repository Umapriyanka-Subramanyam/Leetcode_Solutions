// Last updated: 7/14/2026, 2:19:24 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(0,nums,new ArrayList(),result);
        return result;
    }
    static void backtrack(int index,int nums[],List<Integer> cur_arr,List<List<Integer>> result){
        if(index==nums.length){ 
          result.add(new ArrayList<>(cur_arr));
          return;
      }
      
      cur_arr.add(nums[index]); 
      backtrack(index+1,nums,cur_arr,result);
      
      cur_arr.remove(cur_arr.size()-1); 
      backtrack(index+1,nums,cur_arr,result);
    }
    
}