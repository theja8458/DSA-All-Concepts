import java.lang.reflect.Array;
import java.util.ArrayList;

public class KthLevelOfTree {
   static class Node{
    int data;
    Node right;
    
    Node left;

    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
   }
   public static void kthleveldata(Node root,int level,int k){
    if(level == k){
        System.out.print(root.data+" ");
        return;
    }

    kthleveldata(root.left, level+1, k);
    kthleveldata(root.right, level+1, k);
   }




   public static  boolean getpath(Node root,int n ,ArrayList<Node> path){

    if(root == null){
        return false;
    }
       path.add(root);

       if(root.data==n){
        return true;
       }
       boolean foundLeft=getpath(root.left, n, path);
       boolean founfRight=getpath(root.right, n, path);

       if(foundLeft || founfRight){
        return true;
       }

       path.remove(path.size()-1);
       return false;
   }

   public static Node lca(Node root,int n1,int n2){
    ArrayList<Node> path1=new ArrayList<>();
    ArrayList<Node> path2=new ArrayList<>();

    getpath(root,n1,path1);
    getpath(root,n2,path2);

    int i=0;
    for(; i<path1.size() && i<path2.size(); i++){
        if(path1.get(i) != path2.get(i)){
            break;
        }
    }
    Node lca=path1.get(i-1);
    return lca;

   }

   public static Node lca2(Node root,int n1,int n2){
    
    if(root == null || root.data == n1 || root.data == n2){
        return root;
    }

    Node leftLca=lca2(root.left, n1, n2);
    Node rightLca=lca2(root.right, n1, n2);

    if(rightLca == null){
        return leftLca;
    }
    if(leftLca == null){
        return rightLca;
    }

    return root;
   }
       public static int lcadist(Node root,int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
       int leftdis=lcadist(root.left, n);
       int rightdis=lcadist(root.right, n);

       if(leftdis == -1 && rightdis == -1){
        return -1;
       }else if(leftdis == -1){
        return rightdis+1;
       }else{
        return leftdis+1;
       }
        
       }
   public static int Mindistance(Node root,int n1 , int n2){
    Node lca=lca2(root, n1, n2);
    int dis1=lcadist(lca,n1);
    int dis2=lcadist(lca,n2);

    return dis1+dis2;
   }


   public static int kthAncestor(Node root,int n,int k){
     if(root == null){
        return -1;
     }
    if(root.data == n){
        return 0;
    }

    int leftdist=kthAncestor(root.left, n, k);
    int rightdist=kthAncestor(root.right, n, k);

    if(leftdist == -1 && rightdist == -1){
        return -1;
    }

    int max=Math.max(leftdist,rightdist);

    if(max+1 == k){
        return root.data;
    }
    return max+1;
   }

   
   public static int TransToSumTree(Node root){
    if(root == null){
        // Systen.out.print(root)
        return 0;
    }

    int leftchild=TransToSumTree(root.left);
    int rightchild=TransToSumTree(root.right);
    int data=root.data;
     int newLeft= root.left == null ? 0: root.left.data;
     int newRight= root.right == null ? 0 : root.right.data;
    root.data=newLeft + leftchild + newRight + rightchild;

    return data;
   }


   public static void preorder(Node root){
    if (root == null) {
        return;
        
    }
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
   }
   public static void main(String args[]){
    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);

    // Node root=new Node(14);
    // root.left=new Node(6);
    // root.right=new Node(9);
    // root.right.left=new Node(7);
    // root.right.left.left=new Node(12);
    // root.right.left.right=new Node(11);

    // kthleveldata(root, 1, 3);
    // System.out.println(lca(root, 4, 6).data);
    // System.out.println(lca2(root, 4, 6).data    );
    // System.out.println(Mindistance(root, 4, 6));
    System.out.println(kthAncestor(root, 5, 2));
    // TransToSumTree(root);
    // preorder(root);
    // kthleveldata(root, 1, 3);
   }
}
