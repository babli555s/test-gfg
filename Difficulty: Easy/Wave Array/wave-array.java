//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Arrays;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int[] a = IntArray.input(br, n);

            Solution obj = new Solution();
            obj.convertToWave(n, a);
            StringBuffer sb = new StringBuffer("");
            for (int i : a) {
                sb.append(i + " ");
            }
            System.out.println(sb.toString());
        }
    }
}

// } Driver Code Ends


class Solution {
    public static void convertToWave(int n, int[] arr) {
         Arrays.sort(arr);

        // Swap adjacent elements
        for (int i = 0; i < n - 1; i += 2) {
            swap(arr, i, i + 1);
        }
    }

    // Swap method to exchange elements at positions a and b
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
