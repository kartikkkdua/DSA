import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class depthFitstSearch {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src,int dest, int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        // 0th vertex
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        
        // 1st vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        
        // 2nd vertex
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        
        // 3rd vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        
        // 4th vertex
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        
        // 5th vertex
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 6, 1));
        
        // 6th vertex
        graph[6].add(new Edge(6, 5, 1));
    }
    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean[] visit){ //O(V+E)
        //visit current 
        System.out.print(curr+" ");
        visit[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visit[e.dest]){
                dfs(graph,e.dest,visit);
            }
        }
        
    }
    public static void main(String args[]){
        int V=7;
        ArrayList<Edge>[] graph=new ArrayList[V];
        createGraph(graph);
        dfs(graph,0, new boolean[V]);
        

    }
}
