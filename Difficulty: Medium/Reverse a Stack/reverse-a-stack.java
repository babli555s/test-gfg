//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        PrintWriter out=new PrintWriter(System.out);
        
        //taking testcases
        int t = Integer.parseInt(br.readLine()); 
    	for(int i=0;i<t;i++)
    	{
            String str=br.readLine();
    		
    		//input n and d
    	    int n=Integer.parseInt(str);
    		Stack<Integer> stack=new Stack<>();
    		String str1=br.readLine();
    		String[] starr1=str1.split(" ");
    		//inserting elements in the array
    		for(int j=0;j<n;j++)
    		{
    		    stack.push(Integer.parseInt(starr1[j]));
    		}
    		//calling reverse() function
            Solution.reverse(stack);
            for(int j:stack){
                out.print(j+" ");
            }
            out.println();
         
out.println("~");
}
         out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
         if (!s.isEmpty()) {
            // Step 1: Pop the top element
            int top = s.pop();
            
            // Step 2: Recursively reverse the remaining stack
            reverse(s);
            
            // Step 3: Insert the popped element at the bottom of the stack
            insertAtBottom(s, top);
        }
    }

    // Helper function to insert an element at the bottom of the stack
    static void insertAtBottom(Stack<Integer> s, int element) {
        if (s.isEmpty()) {
            s.push(element);
            return;
        }
        
        // Pop the top element, insert the current element at the bottom, and then push the popped element back
        int top = s.pop();
        insertAtBottom(s, element);
        s.push(top);
    }
}