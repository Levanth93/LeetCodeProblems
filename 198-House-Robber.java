class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];

        int m1=0;
        int m2=0;

        for(int num:nums){
            int curr=Math.max(m1,m2+num);
            m2=m1;
            m1=curr;
        }
        return m1;
    }
}