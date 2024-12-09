class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int []arr=new int[m+n];
        int i,j;
        for(i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(j=0;j<n;j++){
            arr[i+j]=nums2[j];
        }
        Arrays.sort(arr);
        if(arr.length%2==0) {
            return (arr[arr.length/2]+arr[arr.length/2-1])/2.0;
        } 
        else{
            return arr[arr.length/2];
        }
    }
}