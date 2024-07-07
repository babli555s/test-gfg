//{ Driver Code Starts
import java.util.*;

// Define MyStack class here

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Flush the newline character left by nextInt
        while (T-- > 0) {
            MyStack sq = new MyStack();
            String line = scanner.nextLine();
            Scanner ss = new Scanner(line);
            List<Integer> nums = new ArrayList<>();
            while (ss.hasNextInt()) {
                int num = ss.nextInt();
                nums.add(num);
            }
            int n = nums.size();
            int i = 0;
            while (i < n) {
                int QueryType = nums.get(i++);
                if (QueryType == 1) {
                    int a = nums.get(i++);
                    sq.push(a);
                } else if (QueryType == 2) {
                    System.out.print(sq.pop() + " ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}

// } Driver Code Ends


class MyStack {
    private int[] arr;
    private int top;
    private int capacity;

    // Default constructor with default capacity of 1000
    public MyStack() {
        this(1000);
    }

    // Constructor with specified capacity
    public MyStack(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
        top = -1;
    }

    // Push method to add an element to the stack
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    // Pop method to remove and return the top element from the stack
    public int pop() {
        if (top == -1) {
          //  System.out.println("Stack Underflow");
            return -1; 
        }
        return arr[top--];
    }
}