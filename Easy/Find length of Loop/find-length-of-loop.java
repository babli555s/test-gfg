//{ Driver Code Starts
// driver code

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}

class GFG
{
    public static void makeLoop(Node head, Node tail, int x){
        if (x == 0) return;
        
        Node curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;
        
        tail.next = curr;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t--> 0)
        {
            int n = sc.nextInt();
            
            int num = sc.nextInt();
            Node head = new Node(num);
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                num = sc.nextInt();
                tail.next = new Node(num);
                tail = tail.next;
            }
            
            int pos = sc.nextInt();
            makeLoop(head, tail, pos);
            
            Solution x = new Solution();
            System.out.println( x.countNodesinLoop(head) );
        }
    }
}

// } Driver Code Ends


/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

//Function should return the length of the loop in LL.

class Solution {
    // Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head) {
        if (head == null || head.next == null) {
            return 0; // No loop possible if list is empty or has only one node
        }

        Node slow = head;
        Node fast = head;

        // Detecting loop using Floyd's Cycle-Finding Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;        // Move slow by 1 step
            fast = fast.next.next;   // Move fast by 2 steps
            
            if (slow == fast) {
                // Loop detected. Now let's find the loop length.
                return countLoopLength(slow);
            }
        }

        return 0; // No loop found
    }

    // Helper function to count the length of the loop.
    private static int countLoopLength(Node loopNode) {
        int count = 1;
        Node temp = loopNode;
        while (temp.next != loopNode) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}