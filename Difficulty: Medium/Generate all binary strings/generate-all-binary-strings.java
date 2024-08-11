//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      Solution obj = new Solution();
      List<String> ans = obj.generateBinaryStrings(n);
      for(String s : ans) System.out.print(s+" ");
      System.out.println();
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
 public static List<String> generateBinaryStrings(int n) {
       List<String> result = new ArrayList<>();
        generateBinaryStringsHelper(n, "", result);
        return result;
    }

    private static void generateBinaryStringsHelper(int n, String current, List<String> result) {
        // Base case: if the current string length is equal to n, add it to the result list
        if (n == 0) {
            if (isValidBinaryString(current)) {
                result.add(current);
            }
            return;
        }
        
        // Recursive case: append '0' or '1' to the current string and reduce the problem size
        generateBinaryStringsHelper(n - 1, current + "0", result);
        generateBinaryStringsHelper(n - 1, current + "1", result);
    }

    // Check if the binary string is valid (no consecutive '1's)
    private static boolean isValidBinaryString(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1' && s.charAt(i + 1) == '1') {
                return false;
            }
        }
        return true;
    }
}

    // Main method to test the function
  