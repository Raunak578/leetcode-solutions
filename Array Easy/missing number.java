class Solution {
    public int missingNumber(int[] nums) {
    HashSet set=new HashSet<>();
    for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
    } 
    for(int j=0;j<=nums.length;j++){
        if(!set.contains(j)){
            return j;
        }
    }
    return -1;   
    }
}