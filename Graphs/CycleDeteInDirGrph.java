import java.util.*;
public class CycleDeteInDirGrph {
    static class Edge{
        int src;
        int dest;

        Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void createdGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length ; i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        // graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph,int cur,boolean vis[],boolean stack[]){
        vis[cur]=true;
        stack[cur]=true;
        for(int i=0 ; i<graph[cur].size() ; i++){
            Edge e = graph[cur].get(i);
            if(stack[e.dest]){
                return true;
            }
            if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)){
                return true;
            }
        }
        stack[cur]=false;
        return false;
    }

    public static boolean isCycle(ArrayList<Edge>[] graph){
        boolean vis[]=new boolean[graph.length];
        boolean stack[]=new boolean[graph.length];

        for(int i=0 ; i<graph.length ; i++){
          if(!vis[i]){
            if(isCycleUtil(graph,i,vis,stack)){
                return true;
            }
          }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Edge>[] graph = new ArrayList[4];
        createdGraph(graph);
        System.out.println(isCycle(graph));
    }
}
