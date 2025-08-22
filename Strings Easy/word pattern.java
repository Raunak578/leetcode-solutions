class Solution {
    public boolean wordPattern(String pattern, String s) {
     String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (!map1.containsKey(c)) {
                map1.put(c, word);
            }

            if (!map2.containsKey(word)) {
                map2.put(word, c);
            }

            if (!map1.get(c).equals(word) || !map2.get(word).equals(c)) {
                return false;
            }
        }

        return true;       
    }
}