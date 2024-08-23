//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
       int n = arr.length;

        // Initialize the previous row of the DP table
        boolean prev[] = new boolean[sum + 1];
        
        // Initialize the first cell of the DP table
        prev[0] = true;

        // If the first element is less than or equal to k, mark that sum as achievable
        if (arr[0] <= sum) {
            prev[arr[0]] = true;
        }

        // Fill in the DP table using a bottom-up approach
        for (int ind = 1; ind < n; ind++) {
            // Create an array to store the current row of the DP table
            boolean cur[] = new boolean[sum + 1];
            
            // Initialize the first column of the current row
            cur[0] = true;
            
            for (int target = 1; target <= sum; target++) {
                // Calculate if the current target can be achieved without taking the current element
                boolean notTaken = prev[target];
                
                // Calculate if the current target can be achieved by taking the current element
                boolean taken = false;
                if (arr[ind] <= target) {
                    taken = prev[target - arr[ind]];
                }
                
                // Store the result in the current row of the DP table
                cur[target] = notTaken || taken;
            }
            
            // Update the previous row with the current row
            prev = cur;
        }

        // The final result is stored in the last cell of the previous row
        return prev[sum];
    }
}