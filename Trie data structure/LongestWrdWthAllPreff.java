public class LongestWrdWthAllPreff {
    static class Node{
        Node children[] = new Node[26];
        boolean eow=false;

        public Node(){
            for(int i=0 ; i<26 ; i++){
                children[i]=null;
            }
        }
    }

    static String ans="";
    public static Node root = new Node();

    public static void insert(String str){
        Node cur = root;
        for(int i=0 ; i<str.length() ; i++){
            int idx = str.charAt(i)-'a';
            if(cur.children[idx] == null){
                cur.children[idx] =new Node();
            }
            cur=cur.children[idx];
        }

        cur.eow=true;
    }

     public static void longestWord(Node root,StringBuilder temp){
        if(root == null) return;

        for(int i=0 ; i<26 ; i++){
            if(root.children[i] != null && root.children[i].eow==true){
                char ch=(char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1); //backtrack
            }

          
        }
     }
    public static void main(String args[]){
        String words[]={"a","banana","app","appl","ap","apply","apple"};
        for(int i=0 ; i<words.length ; i++){
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
