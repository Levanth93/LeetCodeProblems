class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> a-b);
        for(int i=0;i<nums.length;i++){
                if(pq.size()<k){
                    pq.add(nums[i]);
                }
                else{
                    if(nums[i]>pq.peek()){
                        pq.poll();
                        pq.add(nums[i]);
                    }
                }
            }
        return pq.poll();
    }
}