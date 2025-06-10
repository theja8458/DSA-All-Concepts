import java.security.interfaces.EdECKey;
import java.util.*;
public class BipartiteGrph {
    static class Edge{
        int src;
        int dest;

        Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    
    public static void creategraph(ArrayList<Edge>[] graph){
        for(int i=0 ; i<graph.length ; i++){
            graph[i]=new ArrayList<>();
        }
       graph[0].add(new Edge(0, 1));
       graph[0].add(new Edge(0, 2));

       graph[1].add(new Edge(1, 0));
       graph[1].add(new Edge(1, 3));

       graph[2].add(new Edge(2, 0));
    //    graph[2].add(new Edge(2, 4));

       graph[3].add(new Edge(3, 1));
    //    graph[3].add(new Edge(3, 4));

    //    graph[4].add(new Edge(4, 2));
    //    graph[4].add(new Edge(4, 3));

    }   

    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int color[]=new int[graph.length];
        for(int i=0 ; i<graph.length ; i++){
            color[i]=-1;
        }
        Queue<Integer> q = new LinkedList<>();
       for(int i=0 ; i<graph.length ; i++){
        if(color[i] == -1){
          q.add(i);
          color[i]=0;

          while(!q.isEmpty()){
            int cur = q.remove();
            for(int j=0 ; j<graph[cur].size() ; j++){
              Edge e=graph[cur].get(j);
              if (color[e.dest] == -1) {
                 int nextCol = color[cur] == 0 ? 1 : 0;
                 color[e.dest]=nextCol;
                 q.add(e.dest);
              }
              else if(color[e.dest] == color[cur]){
                return false;
              }
            }
          }
        }
       }

       return true;
    }

    public static void main(String args[]){
        int v=5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        creategraph(graph);
        System.out.println(isBipartite(graph));
    }
}
