class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int nums[]=new int[m+n];
        int c=0;
        int i=0,j=0;
        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]){
                nums[c]=nums1[i];
                i++;
                c++;
            }else{
                nums[c]=nums2[j];
                j++;
                c++;
            }
        }
        while(i<m){
            nums[c]=nums1[i];
            i++;
            c++;
        }
        while(j<n){
            nums[c]=nums2[j];
            j++;c++;
        } 
         int g=0;
       for(int ele:nums){
        nums1[g++]=ele;
       } 
    }
}