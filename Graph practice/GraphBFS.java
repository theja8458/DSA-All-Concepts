import java.util.*;
class GraphBFS{

    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj){
        int n = adj.size();
        int vis[] = new int[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0]=1;
       ArrayList<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int cur = q.remove();
            ans.add(cur);

            for(int com:adj.get(cur)){
                if(vis[com]!=1){
                    q.add(cur);
                    vis[cur] = 1;
                }
            }
        }
        return ans;
    }

    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // list.add()
    }

}