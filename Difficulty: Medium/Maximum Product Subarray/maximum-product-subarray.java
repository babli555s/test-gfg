//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        if (n == 0) return 0; // Edge case: empty array

        // Initialize variables
        long maxProduct = arr[0];
        long minProduct = arr[0];
        long result = arr[0];

        for (int i = 1; i < n; i++) {
            // If current element is negative, swap max and min products
            if (arr[i] < 0) {
                long temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update max and min products
            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);

            // Update result
            result = Math.max(result, maxProduct);
        }

        return result;
    }
}