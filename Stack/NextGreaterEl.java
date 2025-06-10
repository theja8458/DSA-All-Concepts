import java.util.*;
public class NextGreaterEl {
    //Next greater right
   public static void NextGrater(int arr[],int nextGr[]){
    Stack<Integer> s=new Stack<>();

    for(int i=arr.length-1 ; i>=0 ; i--){
        while(!s.empty() && s.peek() <= arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            nextGr[i]=-1;
        }else{
            nextGr[i]=s.peek();
        }

        s.push(arr[i]);
    }
   }
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        int nextGreat[]=new int [arr.length];
        NextGrater(arr, nextGreat);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(nextGreat[i] +" ");
        }

        //next greater left
        //next smaller right
        //next smaller left
    }
    
}
