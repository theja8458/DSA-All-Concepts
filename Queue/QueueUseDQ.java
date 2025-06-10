import java.util.*;
public class QueueUseDQ {

   static class Queue{
    static Deque<Integer> dq=new LinkedList<>();

    public static void add(int data){
         dq.addLast(data);
    }

    public static int remove(){
        return dq.removeFirst();
    }

    public static int peek(){
        return dq.getFirst();
    } 
   }
    public static void main(String args[]){
       
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek val = "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
    
}
