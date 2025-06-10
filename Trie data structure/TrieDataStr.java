import java.util.*;

class TrieDataStr{
       static class Node{
        Node childre[]=new Node[26];
        boolean eow=false;

      public  Node(){
            for(int i=0 ; i<26 ; i++){
                childre[i]=null;
            }
        }
       }

       public static Node root=new Node();

       public static void insert(String word){
        Node cur = root;

        for(int level=0 ; level<word.length() ; level++){
                int idx = word.charAt(level)-'a';
                if(cur.childre[idx] == null){
                    cur.childre[idx] = new Node();
                }

                cur=cur.childre[idx];
        }

        cur.eow=true;
       }

       public static boolean search(String key){
        Node cur = root;
        for(int level=0 ; level<key.length() ; level++){
           int idx=key.charAt(level) - 'a'; 
          if(cur.childre[idx] == null){
            return false;
          }
          cur=cur.childre[idx];
        }

        return cur.eow==true;
       }

       public static boolean startsWith(String str){
      Node cur = root;
        for(int i=0 ; i<str.length() ; i++){
            int idx = str.charAt(i)-'a';
           if(cur.childre[idx] == null){
            return false;
           }
           cur=cur.childre[idx];
        }

        return true;
       }

       public static boolean worddBreak(String key){
        if(key.length() == 0){
            return true;
        }

        for(int i=1 ; i<=key.length() ; i++){
            if(search(key.substring(0,i)) && worddBreak(key.substring(i))){
                return true;
            }
        }

        return false;
       }
    public static void main(String args[]){
        String arr[]={"apple","apple","app","app","app","app","app"};
        String key = "ilikesamsung";
        // Set<Integer> set = new TreeSet<>();
        for(int i=0 ; i<arr.length ; i++){
            insert(arr[i]);
            
        }
        System.out.println(worddBreak(key));
        System.out.println(startsWith("sams"));
        System.out.println(startsWith("app"));
        
        
        
    }
}