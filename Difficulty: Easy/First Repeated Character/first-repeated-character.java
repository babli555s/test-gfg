// User function Template for Java
class Solution {
    String firstRepChar(String s) {
        // code here
       HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            if (map.get(ch) == 2) {
                return String.valueOf(ch); // return the first repeating character
            }
        }
        
        return "-1";
    }
}