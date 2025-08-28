class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    HashSet<Integer> set=new HashSet<>();
    int n=nums.length;
    for(int i=1;i<=n;i++){
        set.add(i);
    }
    for(int j=0;j<n;j++){
        if(set.contains(nums[j])){
            set.remove(nums[j]);
        }
    }
    return new ArrayList<>(set);    
    }
}