import java.util.*;
public class CycleDetec {
    
    static boolean cycledtec(int src,ArrayList<ArrayList<Integer>> graph,boolean isVis[]){
      Queue<Integer> q = new LinkedList<>();
      q.add(src);
      isVis[src] = true;

      while(!q.isEmpty()){
        int cur = q.remove();
        for(int neigh:graph.get(cur)){
            if(isVis[cur] == true){
                return true;
            }else{
                isVis[cur] = true;
                q.add(cur);
            }
        }
      }
      return false;

    }
    static boolean detect(ArrayList<ArrayList<Integer>> graph,boolean isVis[]){
          
        for(int i=0 ; i<graph.size() ; i++){
           if(!isVis[i]){
            if(cycledtec(i, graph, isVis)){
                return true;
            }
           }

        }
        return false;
    }
    public static void main(String args[]){
        
    }
}
