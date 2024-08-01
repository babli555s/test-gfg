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
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        
        // add code here.
         if (s.isEmpty()) {
            return s;
        }

        // Remove the top element
        int top = s.pop();

        // Recursively sort the remaining stack
        sort(s);

        // Insert the removed element back in sorted order
        sortedInsert(s, top);

        return s;
    }

    // Helper method to insert an element into the sorted stack
    private void sortedInsert(Stack<Integer> s, int element) {
        // If stack is empty or the element is greater than or equal to the top element, push it
        if (s.isEmpty() || element >= s.peek()) {
            s.push(element);
        } else {
            // Remove the top element
            int top = s.pop();

            // Recursive call to insert the element in the correct position
            sortedInsert(s, element);

            // Push the removed element back onto the stack
            s.push(top);
        }
    }
    }