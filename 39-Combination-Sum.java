class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        backtrack(0,candidates,target,comb,result);
        return result;
    }
    public void backtrack(int start,int[] candidates,int target,List<Integer>comb,List<List<Integer>>result){
        if(target==0){
            result.add(new ArrayList<>(comb));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start;i<candidates.length;i++){
            comb.add(candidates[i]);
            backtrack(i,candidates,target-candidates[i],comb,result);
            comb.remove(comb.size()-1);
        }
    }
}