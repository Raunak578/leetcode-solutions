class Solution {
    public int[] frequencySort(int[] nums) {
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
    }    
    List<Integer> list = new ArrayList<>();
    for (int n : nums) list.add(n);
    Collections.sort(list, (a, b) -> {
        if (map.get(a).equals(map.get(b))) {
            return b - a;
        } else {
                return map.get(a) - map.get(b);
        }
        });
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
    return nums;
    }
}