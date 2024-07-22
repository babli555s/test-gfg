//{ Driver Code Starts
import java.util.*;
import java.io.*;


// } Driver Code Ends

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int smallpos=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
          while(arr[i]>0&&arr[i]<size && arr[i]!=arr[arr[i]-1]){
               int correctIndex = arr[i] - 1;
                // Swap arr[i] with arr[correctIndex]
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
          }
    }
    for (int i = 0; i < size; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // If all positions are correct, the missing number is size + 1
        return size + 1;
    }
}


//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) throws IOException
    {

		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		
        //taking testcases
		int t=Integer.parseInt(in.readLine().trim());
		while(t-->0){
		    
		    //input number n
			int n=Integer.parseInt(in.readLine().trim());
			int[] arr=new int[n];
			String s[]=in.readLine().trim().split(" ");
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=Integer.parseInt(s[i]);
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			out.println(missing);
		}
		out.close();
    }
}


// } Driver Code Ends