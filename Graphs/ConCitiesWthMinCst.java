import java.util.*;
public class ConCitiesWthMinCst {
    static class Edge implements Comparable<Edge>{
        int dest;
        int cost;

        Edge(int d,int c){
            this.dest = d;
            this.cost = c;
        }

        @Override
        public int compareTo(Edge e2){
            return this.cost - e2.cost;
        }
    }
    
    public static int conncetCities(int cities[][]){
        boolean vis[] = new boolean[cities.length];
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(0, 0));
        int finalcost=0;

        while(!pq.isEmpty()){
            Edge cur = pq.remove();
            if(!vis[cur.dest]){
                vis[cur.dest] = true;
                finalcost += cur.cost;

                for(int i=0 ; i<cities[cur.dest].length ; i++){
                    if(cities[cur.dest][i] !=0){
                        pq.add(new Edge(i, cities[cur.dest][i]));
                    }
                }
            }
        }

        return finalcost;
    }
    public static void main(String args[]){
        int cities[][]={{0,1,2,3,4},
                        {1,0,5,0,7},
                        {2,5,0,6,0},
                        {3,0,6,0,0},
                        {4,7,0,0,0}

                      };
        System.out.println(conncetCities(cities));
    }
}
