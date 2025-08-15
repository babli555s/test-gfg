// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        int n = arr.length;
        if (n == 0) return ""; // No strings

        // Step 1: Find the shortest string
        int small = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i].length() < arr[small].length()) {
                small = i;
            }
        }

        String temp = arr[small];

        // Step 2: Compare character by character
        int i = 0;
        for (; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            for (int j = 0; j < n; j++) {
                if (arr[j].charAt(i) != ch) {
                    // mismatch found
                    if (i == 0) return ""; // no common prefix
                    return temp.substring(0, i);
                }
            }
        }

        return temp; // whole shortest string is the prefix
    }
}
