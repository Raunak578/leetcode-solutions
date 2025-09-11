class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int num:arr){
        map.put(num,map.getOrDefault(num,0)+1);
    }
     HashSet<Integer> Set = new HashSet<>();
        for (int count :map.values()) {
            if(Set.contains(count)){
                return false;
            }
            else{
                Set.add(count);
            }
        }
    return true;    
    }
}