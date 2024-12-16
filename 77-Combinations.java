class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> comb= new ArrayList<>();
        backtrack(1,result,comb,n,k);
        return result;
    }
    public void backtrack(int start,List<List<Integer>>result,List<Integer> comb,int n,int k){
        if(comb.size()==k){
            result.add(new ArrayList(comb));
            return;
        }
        for(int i=start;i<=n;i++){
            comb.add(i);
            backtrack(i+1,result,comb,n,k);
            comb.remove(comb.size()-1);
        }
    }
}