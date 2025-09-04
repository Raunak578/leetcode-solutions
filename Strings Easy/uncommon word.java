class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
    String[] s3=(s1+" "+s2).split(" ");
    HashMap<String,Integer> map=new HashMap<>();
    for(String s:s3){
        map.put(s,map.getOrDefault(s,0)+1);
    }
    List<String> list=new ArrayList<>(); 
    for(String word:map.keySet()){
        if(map.get(word)==1){
         list.add(word);
         }
    }
    return list.toArray( new String[0]);   
    }
}