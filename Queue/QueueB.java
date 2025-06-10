import java.util.*;
class QueueB{

    static class Queue{
        int arr[];
         int size;
         int rear;
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }

        public  boolean isEmpty(){
            return rear==-1;
        }

        public  void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            
            rear=rear+1;
            arr[rear]=data;
        }

        public  int remove(){
            if(isEmpty()){
                System.out.println("Queue us empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0 ; i<rear ; i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }

        public  int peek(){
            if(isEmpty()){
                System.out.println("Queue us empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
       Queue newQ=new Queue(5);
       newQ.add(1);
       newQ.add(2);
       newQ.add(3);
       newQ.add(4);

       while(!newQ.isEmpty()){
        System.out.println(newQ.peek());
        newQ.remove();
       }
    }

}