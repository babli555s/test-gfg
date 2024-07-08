//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.preToPost(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String preToPost(String pre_exp) {
          Stack<String> stack = new Stack<>();
        int length = pre_exp.length();
        for (int i = length - 1; i >= 0; i--) {
            char c = pre_exp.charAt(i);

            if (isOperator(c)) {
                // Pop two operands from the stack
                String op1 = stack.pop();
                String op2 = stack.pop();

               
                String temp = op1 + op2 + c;

              
                stack.push(temp);
            }
          
            else {
              
                stack.push(c + "");
            }
        }

      
        return stack.peek();
    }
    static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

        // code here
    }

