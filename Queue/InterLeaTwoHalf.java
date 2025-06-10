import java.util.*;
public class InterLeaTwoHalf {

    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        int half=q.size()/2;
        Queue<Integer> first=new LinkedList<>();
        for(int i=1 ; i<=half ; i++){
          first.add(q.remove());
        }

        while ((!first.isEmpty())) {
            q.add(first.remove());
            q.add(q.remove());
        }

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println();
    } 
    
}
