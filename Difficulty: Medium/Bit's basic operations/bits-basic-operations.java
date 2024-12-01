//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            Solution obj = new Solution();
            int ans1=obj.XOR(n,m);
            int ans2=obj.check(a,b);
            int ans3=obj.setBit(c,d);
            System.out.println(ans1+" "+ans2+" "+ans3);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    // XOR function: returns n XOR m
    public int XOR(int n, int m) {
        return n ^ m; 
    }
    // check function: checks if the 'a'th bit (1-indexed) of 'b' is set
    public int check(int a, int b) {
        int mask = 1 << (a - 1); // Create a mask with the ath bit set
        return (b & mask) != 0 ? 1 : 0; // Check if the ath bit of b is set
    }
    // setBit function: sets the 'c'th bit (0-indexed) of 'd'
    public int setBit(int c, int d) {
        int mask = 1 << c; // Create a mask with the cth bit set
        return d | mask; // Set the cth bit in d
    }
}
