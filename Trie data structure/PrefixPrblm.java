public class PrefixPrblm {
  static class Node{
    Node children[] = new Node[26];
    boolean eow=false;
    int fre;
    public Node(){
        for(int i=0 ; i<26 ; i++){
            children[i]=null;
        }
        fre=1;
    }
  }
  public static Node root=new Node();
  public static void insert(String str){
       Node cur=root;

       for(int i=0 ; i<str.length() ; i++){
        int idx=str.charAt(i)-'a';

        if(cur.children[idx] == null){
            cur.children[idx]=new Node();
        }else{
            cur.children[idx].fre++;
        }
        cur=cur.children[idx];
       }
       cur.eow=true;
  }
  public static void findprefix(Node root,String ans){
       if(root == null){
        return;
       }
       if(root.fre == 1){
        System.out.println(ans);
        return;
       }

    for(int i=0 ; i<root.children.length ; i++){
        if(root.children[i] != null){
            findprefix(root.children[i], ans+(char)(i+'a'));
        }
    }
  }

  public static void main(String args[]){
    String arr[]={"zebra","dog","duck","dove"};
    for(int i=0 ; i<arr.length ; i++){
        insert(arr[i]);
    }
    root.fre=-1;
    findprefix(root, "");
  }
}
