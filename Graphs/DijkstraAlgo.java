import java.util.*;
class DijikstraAlgo{
  static class Edge{
    int src;
    int dest;
    int wt;

    Edge(int s,int d,int wt){
        this.src = s;
        this.dest = d;
        this.wt = wt;
    }
  }
   public static void createGraph(ArrayList<Edge>[] graph){
    for(int i=0 ; i<graph.length ; i++){
        graph[i] = new ArrayList<>();
    }

    graph[0].add(new Edge(0, 1, 2));
    graph[0].add(new Edge(0, 2, 4));
    graph[1].add(new Edge(1, 2, 1));
    graph[1].add(new Edge(1, 3, 7));
    graph[2].add(new Edge(2, 4, 3));
    graph[3].add(new Edge(3, 5, 1));
    graph[4].add(new Edge(4, 3, 2));
    graph[4].add(new Edge(4, 5, 5));
   }

   static class Pair implements Comparable<Pair>{
    int n;
    int path;
     Pair(int n,int path){
        this.n = n;
        this.path = path;
     }
    @Override 
    public int compareTo(Pair p2){
        return this.path - p2.path;
    }
   }

   public static void dihikstraAlgo(ArrayList<Edge>[] graph,int src){
    int dis[] = new int[graph.length];
    for(int i=0 ; i<graph.length ; i++){
        if(i != src){
        dis[i]=Integer.MAX_VALUE;
        }
    }


   boolean vis[] = new boolean[graph.length];
   PriorityQueue<Pair> pq = new PriorityQueue<>();
   pq.add(new Pair(src,0));
   
    while(!pq.isEmpty()){
        Pair cur = pq.remove();
        if(!vis[cur.n]){
            vis[cur.n] = true;
         for(int i=0 ; i<graph[cur.n].size() ; i++){
           Edge e = graph[cur.n].get(i);
           int u = e.src;
           int v = e.dest;
           int wt = e.wt;
           if(dis[u]+wt < dis[v]){
            dis[v] = dis[u] + wt;
            pq.add(new Pair(v, dis[v]));
           }
          
         }
        }
    }

    for(int i=0 ; i<dis.length ; i++){
        System.out.print(dis[i]+" ");   
    }
    System.out.println();

}
  public static void main(String args[]){
    ArrayList<Edge>[] graph = new ArrayList[6];
    createGraph(graph);
    dihikstraAlgo(graph, 0);
  }
}