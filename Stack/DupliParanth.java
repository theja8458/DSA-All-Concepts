import java.util.*;
public class DupliParanth {
     public static boolean dupliparent(String str){
    Stack<Character> s=new Stack<>();
        for(int i=0 ; i<str.length() ; i++){
            char ch=str.charAt(i);
           if(ch=='(' || ch=='+' || ch=='a' || ch=='b' || ch=='c' || ch=='d' ){
            s.push(ch);
           }else{
            int count=0;
            while(s.peek()!='('){
                s.pop();
                count++;
            }
            if(count < 1){
                return true;
            }
            s.pop();
            if(s.isEmpty()){
                return false;
            }
           }
        }
        return false;
     }
    public static void main(String args[]){
        String str="(((a+b)+(c+d)))";
        String str2="(a-b)";
      System.out.println(dupliparent(str));
      System.out.println(dupliparent(str2));
    }
    
}
