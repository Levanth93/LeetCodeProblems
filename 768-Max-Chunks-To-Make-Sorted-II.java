class Solution {
    public int maxChunksToSorted(int[] arr) {
         int[] lmax=new int[arr.length];
         int[] min=new int[arr.length];
         int count=0;
         lmax[0]=arr[0];
         for(int i=1;i<arr.length;i++){
            lmax[i]=Math.max(arr[i],lmax[i-1]);
         }
         min[arr.length-1]=arr[arr.length-1];
         for(int i=arr.length-2;i>=0;i--){
            min[i]=Math.min(min[i+1],arr[i]);
         }
         for(int i=0;i<arr.length-1;i++){
            if(lmax[i]<=min[i+1]){
                count++;
            }
         }
         return count+1;
    }
}