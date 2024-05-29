class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean visited[] = new boolean[V];
        
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        visited[0]=true;
        
        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);
            for(Integer n : adj.get(node)){
                if(!visited[n]){
                    visited[n]=true;
                    q.add(n);
                }
            }
        }
        return bfs;
    }
}
