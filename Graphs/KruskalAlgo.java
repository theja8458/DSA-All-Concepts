import java.util.*;
class KruskalAlgo{
   static class Edge implements Comparable<Edge>{
    int src;
    int dest;
    int wt;

    Edge(int s,int d,int wt){
        this.src = s;
        this.dest = d;
        this.wt = wt;
    }

    @Override
    public int compareTo(Edge e2){
        return this.wt - e2.wt;
    }
   }

   static void createGraph(ArrayList<Edge> graph){
    //   for(int i=0 ; i<graph.length ; i++){
    //     graph[i] = new ArrayList<>();
    //   }

      graph.add(new Edge(0, 1, 10));
      graph.add(new Edge(0, 2, 15));
      graph.add(new Edge(0, 3, 30));
      graph.add(new Edge(1, 3, 40));
      graph.add(new Edge(2, 3, 30));
      
   }

   static int n=4;
   static int par[] = new int[n];
   static int rank[] = new int[n];
   
   static void initi(){
    for(int i=0 ; i<n ; i++){
        par[i] = i;
    }
   }
   
   public static int find(int x){
    if(par[x] == x){
        return x;
    }

    return par[x] = find(par[x]);
   }

   public static void union(int a,int b){
    int parA = find(a);
    int parB = find(b);

    if(rank[parA] == rank[parB]){
        par[parB] = parA;
        rank[parA]++;
    }else if(rank[parA] < rank[parB]){
        par[parA] = parB;
    }else{
        par[parB] = parA;
    }
   }

   public static int kruskalalgo(ArrayList<Edge> graph,int V){
    initi();
    int count=0;
    int finalmst=0; 
    for(int i=0 ; count<V-1 ; i++){
        Edge e = graph.get(i);
        int parA = find(e.src);
        int parB = find(e.dest);
        if(parA != parB){
           union(e.src, e.dest);
           finalmst+= e.wt;
           count++;
        }
    }
    return finalmst;
   }
   public static void main(String args[]){
    int V=4;
    ArrayList<Edge> graph = new ArrayList<>();
    createGraph(graph);
    System.out.println(kruskalalgo(graph, V));
   }
}