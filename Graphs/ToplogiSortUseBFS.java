import java.util.*;
class TopologiSortUseBFS{
  static class Edge{
    int src;
    int dest;

    Edge(int s,int d){
        this.src = s;
        this.dest = d;
    }
  }
  public static void createGraph(ArrayList<Edge>[] graph){
    for(int i=0 ; i<graph.length ; i++){
        graph[i] = new ArrayList<>();
    }

    graph[2].add(new Edge(2, 3));
    graph[3].add(new Edge(3, 1));
    graph[4].add(new Edge(4, 0));
    graph[4].add(new Edge(4, 1));
    graph[5].add(new Edge(5, 0));
    graph[5].add(new Edge(5, 2));
  }
    public static void helper(ArrayList<Edge>[] graph,int indegree[]){
        for(int i=0 ; i<graph.length ; i++){
            int ver = i;
            for(int j=0 ; j<graph[ver].size() ; j++){
                Edge e = graph[ver].get(j);
                indegree[e.dest]++;
            }
        }
    } 
  public static void topologicalsort(ArrayList<Edge>[] graph){
    int indegree[] = new int[graph.length];
    helper(graph,indegree);
    Queue<Integer> q = new LinkedList<>();
    for(int i=0 ; i<indegree.length ; i++){
        if(indegree[i] == 0){
            q.add(i);
        }
    }

    while(!q.isEmpty()){
        int cur = q.remove();
        System.out.print(cur+" ");
        for(int i=0 ; i<graph[cur].size() ; i++){
            Edge e = graph[cur].get(i);
            indegree[e.dest]--;
            if(indegree[e.dest] == 0){
                q.add(e.dest);
            }
        }
    }
    System.out.println();
  }
  public static void main(String args[]){
    ArrayList<Edge>[] graph = new ArrayList[6];
    createGraph(graph);
    topologicalsort(graph);
  }
}