import java.util.LinkedList;


public class LlUsingColl {

    public static void main(String arg[]){
         //create
         LinkedList<Integer> ll=new LinkedList<>();
          

         //add
         ll.add(1);
         ll.add(2);
         ll.addFirst(0);
         //0->1->2
         System.out.println(ll);

         //remove

         ll.removeLast();
         ll.removeFirst();
         System.out.println(ll);
         
    }
}
