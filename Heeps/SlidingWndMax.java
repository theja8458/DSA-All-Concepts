import java.util.*;
public class SlidingWndMax {
    static class Pair implements Comparable<Pair>{
        int num;
        int idx;

        Pair(int num,int idx){
            this.num=num;
            this.idx=idx;
        }

        @Override
        public int compareTo(Pair p2){
         return p2.num - this.num;
        }
    }
    public static void main(String args[]){
        int arr[]={1,3,-1,-1,5,3,6,7};
        int k=3;
        int res[]=new int[arr.length-k+1];
        PriorityQueue<Pair> pq =new PriorityQueue<>();
        for(int i=0 ; i<k ; i++){
         pq.add(new Pair(arr[i], i));
        }

        res[0]=pq.peek().num;

        for(int i=k ; i<arr.length ; i++){
            while (pq.size() > 0 && pq.peek().idx <= (i-k)) {
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().num;
        }

        for(int i=0 ; i<res.length ; i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}
