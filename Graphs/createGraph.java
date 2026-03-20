import java.util.*;
public class createGraph{
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
    public static void main(String args[]){
        int V=5;
        ArrayList<Edge>[] graph=new ArrayList[V]; //null is stored by deafult
        //now we need convert is to empty arraylist

        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }

        //0th vertix
        graph[0].add(new Edge(0,1, 5));
        //1th vertix
        graph[1].add(new Edge(1,0, 5));
        graph[1].add(new Edge(1,2, 1));
        graph[1].add(new Edge(1,3, 3));
        //2th vertix
        graph[2].add(new Edge(2,1, 1));
        graph[2].add(new Edge(2,3, 1));
        graph[2].add(new Edge(2,4, 2));
        //3th vertix
        graph[3].add(new Edge(3,1, 3));
        graph[3].add(new Edge(3,2, 1));
        //4th vertix
        graph[4].add(new Edge(4,2, 2));

        //2th neighbour
        for(int i=0;i<graph[2].size();i++){ 
            Edge e=graph[2].get(i); //source dest wt
            System.out.println(e.dest);
        }


    }
}