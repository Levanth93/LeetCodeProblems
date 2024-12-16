class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> set=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        int n=nums.length;
        backtrack(0,set,subset,nums);
        return set;
    }
    public void backtrack(int start,List<List<Integer>> set,List<Integer> subset,int nums[]){
        set.add(new ArrayList(subset));
         for(int i=start;i<nums.length;i++){
            subset.add(nums[i]);
            backtrack(i+1,set,subset,nums);
            subset.remove(subset.size()-1);
         }
    }
}