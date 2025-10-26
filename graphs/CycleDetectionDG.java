import java.util.ArrayList;

public class CycleDetectionDG {
     static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
        
    }

    public static boolean isCycle( ArrayList<Edge> graph[] ){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length]; //to keep track of visited vertices during recursion

        for(int i=0;i<graph.length;i++){
            // running loop on all cc of the graph
            if (!vis[i]) {
                //check curr vertice is visited or not
                if (isCycleUtil(graph,i,vis,stack)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isCycleUtil( ArrayList<Edge> graph[],int curr,boolean vis[],boolean stack[] ){
        vis[curr] = true;
        stack[curr] = true;

        for(int i=0;i<graph[curr].size();i++){ //run a loop for all the edges at idx curr
            Edge e = graph[curr].get(i); //get curr vertice
            if (stack[e.dest]) { //cycle exists
                return true;
            }

            if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) { //if neighbor not visit and check for cycle
                return true;
            }
        }
        
        stack[curr] = false; //as when we return from the recursion curr vertice will be removed from the stack
        return false;
    }



    public static void main(String[] args) {
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        
        System.out.println(isCycle(graph));
    }
}