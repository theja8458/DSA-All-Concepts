public class MirrorOfBST {
    static class Node{

        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
 
    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node mirrorBST(Node root){
        if(root == null){
            return null;
        }

        Node lefts=mirrorBST(root.left);
        Node rights=mirrorBST(root.right);

        root.left=rights;
        root.right=lefts;

        return root;
    }

    public static void main(String args[]){
      Node root=new Node(8);
      root.left=new Node(5);
      root.left.left=new Node(3);
      root.left.right=new Node(6);
      root.right=new Node(10);
      root.right.right=new Node(11);

      preorder(root);
      System.out.println();
      mirrorBST(root);
      preorder(root);
    }
}
