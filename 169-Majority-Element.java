class Solution {
    public int majorityElement(int[] nums) {
        return helper(nums,0,nums[0]);
    }
    public int helper(int[] nums,int start,int val){
        int count =0;
        for(int i=start;i<nums.length;i++){
            if(val==nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==-1){
                return helper(nums,i,nums[i]);
            }
        }
    return val;
    }
}