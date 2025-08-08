class Solution {
    public int removeDuplicates(int[] nums) {
    HashSet<Integer> set=new LinkedHashSet<>();
    for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
    }
    int i = 0;
       for(int val : set){
        nums[i++] = val;
       } 
    return set.size();   
    }
}