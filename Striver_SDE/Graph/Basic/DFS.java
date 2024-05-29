class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> dfs = new ArrayList<>();
        boolean visited[] = new boolean[V];
        visited[0] = true;
        DFSUtil(0,adj,dfs,visited);
        return dfs;
    }
    public void DFSUtil(int node, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfs, boolean visited[]){
        visited[node]=true;
        dfs.add(node);
        for(Integer it : adj.get(node)){
            if(visited[it]==false)
                DFSUtil(it,adj,dfs,visited);
        }
    }
}
