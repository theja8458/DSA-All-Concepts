import java.util.*;
public class ReverStack {
      public static void reverse(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        reverse(s, data);
        s.push(top);
      }
      public static void Printstack(Stack<Integer> s){
          while(!s.isEmpty()){
            System.out.println(s.pop());
          }
      }

      public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        reverse(s, top);
      }
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        Printstack(s);
        // Stack<Integer> s2=new Stack<>();
        // while(!s.isEmpty()){
        //     s2.push(s.pop());
        // }

        // while(!s2.isEmpty()){
        //     System.out.println(s2.pop());
        // }
    }
    
}
