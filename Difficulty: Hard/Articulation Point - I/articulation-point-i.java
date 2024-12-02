//{ Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer>ans = obj.articulationPoints(V, adj);
            for (int i =0 ;i < ans.size (); i++) 
                System.out.print (ans.get (i) + " ");
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    private int time = 0; // To track discovery time of vertices
    
    // Function to return articulation points in the given graph.
    public ArrayList<Integer> articulationPoints(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        int[] disc = new int[V]; // Discovery times of visited vertices
        int[] low = new int[V];  // Earliest visited vertex reachable
        int[] parent = new int[V]; // Parent vertices in DFS tree
        boolean[] ap = new boolean[V]; // To mark articulation points
        
        // Initialize parent and visited arrays
        for (int i = 0; i < V; i++) {
            parent[i] = -1; // Initialize parent as -1 (root)
            visited[i] = false;
            ap[i] = false; // No articulation point initially
        }
        
        // Perform DFS for each vertex to cover all components
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, visited, disc, low, parent, ap, adj);
            }
        }
        
        // Collect all articulation points
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (ap[i]) {
                result.add(i);
            }
        }
        
        // If there are no articulation points, return -1
        if (result.isEmpty()) {
            result.add(-1);
        }
        return result;
    }
    
    // A recursive function to find articulation points using DFS
    private void dfs(int u, boolean[] visited, int[] disc, int[] low, int[] parent, boolean[] ap, ArrayList<ArrayList<Integer>> adj) {
        int children = 0; // Count of children in the DFS tree
        visited[u] = true;
        
        // Initialize discovery time and low value
        disc[u] = low[u] = ++time;
        
        // Go through all vertices adjacent to this vertex
        for (int v : adj.get(u)) {
            // If v is not visited yet, make it a child of u in DFS tree
            if (!visited[v]) {
                children++;
                parent[v] = u;
                dfs(v, visited, disc, low, parent, ap, adj);
                
                // Check if the subtree rooted at v has a connection back to an ancestor of u
                low[u] = Math.min(low[u], low[v]);
                
                // u is an articulation point if:
                
                // Case 1: u is root of DFS tree and has two or more children
                if (parent[u] == -1 && children > 1) {
                    ap[u] = true;
                }
                
                // Case 2: u is not root and low value of one of its child is more than discovery value of u
                if (parent[u] != -1 && low[v] >= disc[u]) {
                    ap[u] = true;
                }
            } else if (v != parent[u]) {
                // Update low value of u for parent function calls
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
}
