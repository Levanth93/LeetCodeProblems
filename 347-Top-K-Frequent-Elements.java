class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            int freq=map.getOrDefault(i,0);
            map.put(i,freq+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> map.get(a)-map.get(b));
        int []ans = new int[k];
        for(int n:map.keySet()){
            pq.add(n);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int i=0;
        while(pq.size()!=0){
            ans[i]=pq.poll();
            i++;
        }
        return ans;
    }
}