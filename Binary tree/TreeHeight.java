import java.util.*;
public class TreeHeight {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }

    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int lcount=count(root.left);
        int rcount=count(root.right);
        return lcount+rcount+1;
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int leftsum=sum(root.left);
        int rightsum=sum(root.right);

        return leftsum+rightsum+root.data;
    }

    public static int diameter2(Node root){
        if(root == null ){
            return 0;
        }

        int leftdia=diameter2(root.left);
        int lh=height(root.left);
        int rightDia=diameter2(root.right);
        int rh=height(root.right);
        int selfdia=lh+rh+1;
        // int firmax=Math.max(leftdia, rightDia);

        return Math.max(selfdia,Math.max(leftdia,rightDia));
        
    }

    // static class Info{
    //     int dia;
    //     int ht;
    //     Info(int dia,int ht){
    //         this.dia=dia;
    //         this.ht = ht; 
    //     }

    // }

    // public static Info diameter(Node root){
    //     if(root == null){
    //         return new Info(0, 0);
    //     }

    //     Info leftinfo=diameter(root.left);
    //     Info rightinfo=diameter(root.right);
    //      int diam=Math.max(Math.max(leftinfo.dia,rightinfo.dia),leftinfo.ht+rightinfo.ht+1);
    //     int height=Math.max(leftinfo.ht,rightinfo.ht)+1;

    //     return new Info(diam, height);
    // }

    static class Info{
        Node node;
        int hd;

        Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }

    public static void topviewoftree(Node root){
       Queue<Info> q=new LinkedList<>();
       HashMap<Integer,Node> map=new HashMap<>();
      int min=0,max=0;
       q.add(new Info(root, 0));
       q.add(null);

       while(!q.isEmpty()){
        Info cur=q.remove();

        if(cur == null){
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }else{

        if(!map.containsKey(cur.hd)){
            map.put(cur.hd, cur.node);
        }
        if(cur.node.left != null){
            q.add(new Info(cur.node.left, cur.hd-1));
           min=Math.min(min,cur.hd-1);
        }

        if(cur.node.right != null){
            q.add(new Info(cur.node.right, cur.hd+1));
            max=Math.max(max, cur.hd+1);
        }
    }
    }
        for(int i=min ; i<=max ; i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
       
    }
    
   public static boolean identical(Node root,Node subroot){
    if(root == null && subroot == null){
        return true;
    }
    else if(root == null || subroot ==  null || root.data != subroot.data){
        return false;
    }
    if(!identical(root.left, subroot.left)){
        return false;
    }
    if(!identical(root.right, subroot.right)){
        return false;
    }
    return true;
   }
    public static boolean isSubtree(Node root,Node subroot){
        if(root == null){
            return false;
        }

        if(root.data == subroot.data){
            if(identical(root,subroot)){
                return true;
            }
        }

        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static void main(String args[]){
        /*
                1
               / \
              2   3
             / \   \
            4   5    7
         */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        // System.out.println(diameter(root).dia);
        // System.out.println("Total sum of nodes = "+sum(root));
        // System.out.println("Tree Height = "+height(root));
        // System.out.println("Tree Nodes count = "+count(root));
        topviewoftree(root);

        Node subtree=new Node(2);
        subtree.left=new Node(4);
        subtree.right=new Node(5);
        System.out.println(isSubtree(root, subtree));

    }
}
