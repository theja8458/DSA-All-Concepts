import java.util.*;
public class CheapFlighWithK {
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph,int flights[][]){
        for(int i=0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0 ; i<flights.length ; i++){
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];
            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }
    static class Info{
        int v;
        int cost;
        int stops;

        Info(int v,int c,int k){
            this.v = v;
            this.cost = c;
            this.stops = k;
        }
    }
    public static int chepFlight(int n,int src,int dest,int k,int flights[][]){
        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(graph, flights);
        int dis[] = new int[n];
        for(int i=0 ; i<dis.length ; i++){
        if(i != src){
            dis[i] = Integer.MAX_VALUE;
        }
    }

    Queue<Info> q = new LinkedList<>();
    q.add(new Info(src, 0, 0));
       while(!q.isEmpty()){
        Info cur = q.remove();
        if(cur.stops > k){
            break;
        }

        for(int i=0 ; i<graph[cur.v].size() ; i++){
            Edge e = graph[cur.v].get(i);
            int u = e.src;
            int v = e.dest;
            int wt = e.wt;

            if(cur.cost+wt < dis[v] && cur.stops <= k){
                dis[v] = cur.cost+wt;
                q.add(new Info(v, dis[v], cur.stops+1));
            }
        }
       } 

       if(dis[dest] == Integer.MAX_VALUE){
        return -1;
       }else{
        return dis[dest];
       }
    }
    public static void main(String args[]){
        int n=4;
        int flights[][]={{0,1,100},{1,2,100},{1,3,600},{2,3,200}};
        int src=0,dest=3,k=1;
       System.out.println(chepFlight(n, src, dest, k, flights));

    }
}
