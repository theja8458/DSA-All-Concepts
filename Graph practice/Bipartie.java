import java.util.*;
public class Bipartie {
    
    static boolean bipartie(ArrayList<ArrayList<Integer>> graph){
        int col[] = new int[graph.size()];
        for(int i=0 ; i<graph.size() ; i++){
            col[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0 ; i<graph.size() ; i++){
            if(col[i] == -1){
                col[i] = 0;
                q.add(i);
                while(!q.isEmpty()){
                    int cur = q.remove();
                    for(int j:graph.get(cur)){
                        if(col[j] ==  -1){
                            int nextcol = col[cur]==0 ? 1 : 0;
                            col[j] = nextcol;
                            q.add(j);
                        }else if(col[cur] == col[j]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int n = 4;
        for(int i=0 ; i<n ; i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        // graph.get(0).add(2);
        graph.get(0).add(3);
        graph.get(1).add(0);
        graph.get(1).add(2);
        // graph.get(2).add(0);
        graph.get(2).add(1);
        graph.get(2).add(3);
        graph.get(3).add(0);
        graph.get(3).add(2);
        System.out.println(bipartie(graph));
    }
}
