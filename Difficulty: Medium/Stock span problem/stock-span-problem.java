//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    // Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n) {
        // Your code here
        int[] span = new int[n];
        
        // Stack to keep indices of price array
        Stack<Integer> stack = new Stack<>();

        // Traverse the price array
        for (int i = 0; i < n; i++) {
            // Calculate span
            while (!stack.isEmpty() && price[i] >= price[stack.peek()]) {
                stack.pop();
            }
          // If the stack is empty, it means price[i] is greater than all prices before it
            span[i] = (stack.isEmpty()) ? i + 1 : i - stack.peek();
            // Push this element to the stack
            stack.push(i);
        }
        return span;
    }
}


//{ Driver Code Starts.

class gfg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];

            int i = 0;
            for (i = 0; i < n; i++) a[i] = sc.nextInt();

            int[] s = new Solution().calculateSpan(a, n);

            for (i = 0; i < n; i++) {
                System.out.print(s[i] + " ");
            }

            System.out.println();
        }
    }
}
// } Driver Code Ends