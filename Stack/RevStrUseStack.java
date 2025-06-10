import java.util.*;
public class RevStrUseStack {

 public static String reverseString(String str){
 Stack<Character> s=new Stack<>();
 int idx= 0;
 while(idx < str.length()){
      s.push(str.charAt(idx));
      idx++;
 }

    StringBuilder newstr=new StringBuilder("");
         while(!s.isEmpty()){
            newstr.append(s.pop());
         }
         return newstr.toString();
}
    public static void main(String args[]){
        String str="HelloWorld";
        String result=reverseString(str);
        System.out.println(result);
//     Stack<String> s=new Stack<>();
    
//     s.push("a");
//     s.push("b");
//     s.push("c");
//     String str="";
//     while(!s.isEmpty()){
//            str+=s.pop();
//     }
//    System.out.println(str);
    }
}
