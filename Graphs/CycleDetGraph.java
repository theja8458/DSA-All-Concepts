import java.util.*;

public class CycleDetGraph {
    static class Edge{
        int src;
        int dest;

        Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

 public static void createGraph(ArrayList<Edge>[] graph){
    for(int i=0 ; i<graph.length ; i++){
        graph[i] = new ArrayList<>();
    }

    graph[0].add(new Edge(0, 1));
    // graph[0].add(new Edge(0, 2));
    graph[0].add(new Edge(0, 3));

    graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 2));

    // graph[2].add(new Edge(2, 0));
    graph[2].add(new Edge(2, 1));
    // graph[2].add(new Edge(2, 4));

    graph[3].add(new Edge(3, 0));
    graph[3].add(new Edge(3, 4));

    graph[4].add(new Edge(4, 3));
 }

   public static boolean detectCycle(ArrayList<Edge>[] graph){
    boolean vis[]=new boolean[graph.length];
    for(int i=0 ; i<graph.length ; i++){
        if(!vis[i]){
           if( detectCycleUtil(graph,vis,i,-1)){
            return true;
           }
        }
    }
    return false;
   }

   public static boolean detectCycleUtil(ArrayList<Edge>[] graph,boolean vis[],int cur,int par){
    vis[cur]=true;

    for(int i=0 ; i<graph[cur].size() ; i++){
        Edge e=graph[cur].get(i);
        //case 3
        if(!vis[e.dest]){
            if(detectCycleUtil(graph, vis, e.dest, cur)){
                return true;
            }
        }
        //case 2
        else if(vis[e.dest] && e.dest != par){
            return true;
        }
        //case 1 do nothing
    }
    return false;
   }
    public static void main(String args[]){
        int v=5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph); 
        System.out.println(detectCycle(graph));
    }
}
