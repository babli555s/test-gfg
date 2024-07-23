//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int n = arr.length;
        int m = arr[0].length;
        int maxRowIndex = -1; // Index of the row with maximum 1s
        int max1sCount = 0; // Maximum number of 1s found
        int j = m - 1; // Start from the last column
        
        // Iterate over rows
        for (int i = 0; i < n; i++) {
            // Move left until we find a 0 or run out of columns
            while (j >= 0 && arr[i][j] == 1) {
                j--;
                // Update the maxRowIndex and max1sCount if needed
                if (j < m - 1) {
                    maxRowIndex = i;
                    max1sCount = m - (j + 1);
                }
            }
        }
        
        return maxRowIndex;
    }


}