//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

class SortedStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Integer> s = new Stack<>();
            int n = sc.nextInt();
            while (n-- > 0) s.push(sc.nextInt());
            GfG g = new GfG();
            Stack<Integer> a = g.sort(s);
            while (!a.empty()) {
                System.out.print(a.peek() + " ");
                a.pop();
            }
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
    if (!s.isEmpty()) {
            // Step 1: Pop the top element
            int top = s.pop();
            
            // Step 2: Recursively sort the remaining stack
            sort(s);
            
            // Step 3: Insert the popped element back in the correct position
            sortedInsert(s, top);
        }
        return s;
    }
    
    // Helper function to insert an element in a sorted manner
    private void sortedInsert(Stack<Integer> s, int element) {
        // Base case: If stack is empty or the top element is smaller than the current element
        if (s.isEmpty() || s.peek() <= element) {
            s.push(element);
            return;
        }
        
        // Recursive case: Pop the top element, insert the current element, then push back the popped element
        int top = s.pop();
        sortedInsert(s, element);
        s.push(top);
    }
}

    