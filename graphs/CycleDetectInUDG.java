import java.util.ArrayList;

public class CycleDetectInUDG {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge( 0,  1,  1));
        graph[0].add(new Edge( 0, 2,  1));

        graph[1].add(new Edge( 1, 0,  1));
        graph[1].add(new Edge( 1, 3 , 1));

        graph[2].add(new Edge( 2,  0,  1));
        graph[2].add(new Edge( 2,  4,  1));

        graph[3].add(new Edge( 3,  1,  1));
        graph[3].add(new Edge( 3,  4,  1));
        graph[3].add(new Edge( 3,  5,  1));

        graph[4].add(new Edge( 4,  2,  1));
        graph[4].add(new Edge( 4,  3,  1));
        graph[4].add(new Edge( 4,  5,  1));

        graph[5].add(new Edge( 5,  6,  1));
        graph[5].add(new Edge( 5,  3,  1));
        graph[5].add(new Edge( 5,  4,  1));
    }


    public static boolean isCycle(ArrayList<Edge> graph[],boolean visit[],int curr,int par){
        for(int i=0;i<graph.length;i++){
            if (!visit[i]) {
                if (isCycleUtil(graph, visit, curr, par)) {
                    return true;
                }
            }
        }

        return false;
    }


    public static boolean isCycleUtil(ArrayList<Edge> graph[], boolean visit[], int curr, int par) {
        visit[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
    
            // Case 1: If not visited, recurse
            if (!visit[e.dest]) {
                if (isCycleUtil(graph, visit, e.dest, curr)) { // neighbor <--> curr 
                    return true;
                }
            }
    
            // Case 2: If visited and not parent, it's a cycle
            else if (e.dest != par) {
                return true;
            }
    
            // Case 3: If visited and is parent, do nothing
        }
    
        return false;
    }
    



    public static void main(String[] args) {
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        System.out.println(isCycle(graph, new boolean[graph.length], 0, -1));

    }
}
