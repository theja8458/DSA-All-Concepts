
    import java.util.*;
    public class GraphBFS {
  static class Edge{
    int src;
    int dest;
    int wt;
    public Edge(int s,int d,int w){
        this.src=s;
        this.dest=d;
        this.wt=w;
    }
  }
 public static void crateGraph(ArrayList<Edge> graph[]){
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

   public static void bfs(ArrayList<Edge>[] graph){
    Queue<Integer> q = new LinkedList<>();
    boolean visited[]=new boolean[graph.length];
    q.add(0);

    while(!q.isEmpty()){
       int cur = q.remove();

       if(!visited[cur]){
         visited[cur] = true;
         System.out.print(cur+" ");
         for(int i=0 ; i<graph[cur].size() ; i++){
            Edge e = graph[cur].get(i);
            q.add(e.dest);
         }
       }
    }

   }

   public static void dfs(ArrayList<Edge>[] graph,int cur,boolean vis[]){

    System.out.print(cur+" ");
    vis[cur] = true;

    for(int i=0 ; i<graph[cur].size() ; i++){
        Edge e = graph[cur].get(i);
        if(!vis[e.dest]){
            dfs(graph, e.dest, vis);
        }
    }
   }

   public static boolean hasPath(ArrayList<Edge>[] graph,int src,int dest,boolean vis[]){
    if(src == dest){
      return true;
    }
    vis[src] = true;
    for(int i=0 ; i<graph[src].size() ; i++){
      Edge e = graph[src].get(i);
      if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
        return true;
      }
    }
    return false;
   }
    public static void main(String args[]){
     int v=7;

     ArrayList<Edge> graph[] = new ArrayList[v];
     crateGraph(graph);
    //  bfs(graph);
    // System.out.println();
    // dfs(graph, 0, new boolean[v]);
    
     System.out.println(hasPath(graph, 0, 5, new boolean[v]));
    
}
    }
