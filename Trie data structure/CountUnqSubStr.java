

public class CountUnqSubStr {
    static class Node{
        Node children[]=new Node[26];
    }

    static Node root=new Node();
    public static void insert(String str){
       Node cur = root;

       for(int i=0 ; i<str.length (); i++){
        int idx = str.charAt(i)-'a';
        if(cur.children[idx] == null){
            cur.children[idx] = new Node();
        }
        cur = cur.children[idx];
       }
    }
      
    public static int CountNodes(Node root){
        if(root == null) return 0;
        int count=0;
        for(int i=0 ; i<26 ; i++){
            if(root.children[i]!=null){
                count+=CountNodes(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String args[]){
        String str="ababa";
    
    for(int i=0 ; i<str.length() ; i++){
        String suffix = str.substring(i);
        insert(suffix);
    }
    System.out.println(CountNodes(root));
}
}
