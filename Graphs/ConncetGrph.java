import java.util.*;
public class ConncetGrph {
    static class Edge{
        int src;
        int dest;
        int ht;

        Edge(int s,int d,int h){
            this.src=s;
            this.dest=d;
            this.ht=h;
        }
    }   
   public static void createGraph(ArrayList<Edge>[] graph){
    for(int i=0 ; i<graph.length ; i++){
        graph[i]=new ArrayList<>();
    }
    graph[0].add(new Edge(0, 1, 1));
     graph[0].add(new Edge(0, 2, 1));

     graph[1].add(new Edge(1, 0, 1));
     graph[1].add(new Edge(1, 3, 1));

     graph[2].add(new Edge(2, 0, 1));
     graph[2].add(new Edge(2, 4, 1));

     graph[3].add(new Edge(3, 1, 1));
     graph[3].add(new Edge(3, 4, 1));
     graph[3].add(new Edge(3, 5, 1));

     graph[4].add(new Edge(4, 2, 1));
     graph[4].add(new Edge(4, 3, 1));
     graph[4].add(new Edge(4, 5, 1));

    graph[5].add(new Edge(5, 3, 1));
    graph[5].add(new Edge(5, 4, 1));
    graph[5].add(new Edge(5, 6, 1));

    graph[6].add(new Edge(6, 5, 1));

   }
   public static void bfs(ArrayList<Edge>[] graph ){
    boolean vis[]=new boolean[graph.length];
    for(int i=0 ; i<graph.length ; i++){
       if(!vis[i]){  
        bfsUitl(graph,vis);
       }
    }
   } 
   public static void bfsUitl(ArrayList<Edge>[] graph,boolean vis[]){
    Queue<Integer> q = new LinkedList<>();
    q.add(0);
    while(!q.isEmpty()){
        int cur = q.remove();
        if(!vis[cur]){
            System.out.print(cur+" ");
            vis[cur]=true;
            for(int i=0 ; i<graph[cur].size() ; i++){
                Edge e = graph[cur].get(i);
                q.add(e.dest);
            }
        }
    }
   }

   public static void dfs(ArrayList<Edge>[] graph){
    boolean vis[]=new boolean[graph.length];
    for(int i=0 ; i<graph.length ; i++){
        if(!vis[i]){
           dfsUitl(graph, i, vis);
        }
    }
   }

   public static void dfsUitl(ArrayList<Edge>[] graph,int cur,boolean vis[]){
    System.out.print(cur+" ");
    vis[cur]=true;
    for(int i=0 ; i<graph[cur].size() ; i++){
        Edge e = graph[cur].get(i);
    if(!vis[e.dest]){
       dfsUitl(graph, e.dest, vis);
        
    }
}

   }
  public static void main(String args[]){
    int v=7;
    ArrayList<Edge>[] graph=new ArrayList[v];
    createGraph(graph);
    bfsUitl(graph, new boolean[v]);
    System.out.println();
    dfsUitl(graph, 0, new boolean[v]);
    System.out.println();
    // System.out.println(count);
  }

}
