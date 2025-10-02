class Solution {
    public int findLengthOfLCIS(int[] nums) {
    if(nums.length == 1) return 1;
        int left = 0;
        int right = 1;
        int maxLen = 1;
        while(right < nums.length){
            if(nums[right] > nums[right-1]){
                int len = right-left+1;
                maxLen = Math.max(maxLen,len);
            }else{
                left = right;
            }
            right++;
        }
        return maxLen;   
    }
}