class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer>map = new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);  // put all char of s in map
        }

        for(char c : t.toCharArray()){
            if(!map.containsKey(c)){
                return false;   // if map does not contain char of t, then it is not a anagram
            }

            map.put(c,map.get(c) - 1);  // if map contain deduct it value

            if(map.get(c) == 0){
                map.remove(c);
            }
        }
        return map.isEmpty();
    }
}
