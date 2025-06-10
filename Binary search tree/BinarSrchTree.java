class BinarSrchTree{
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
        }
    }
   public static Node insert(Node root,int val){
    if(root == null){
        root =new Node(val);
        return root;
    }

    if(root.data > val){
        root.left=insert(root.left, val);
    }

    if(root.data < val){
        root.right=insert(root.right, val);
    }
    return root;
   }

   public static void inorder(Node root){
    if(root == null){
        return;
    }
    // System.out.print(root.data+" ");
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
   }


   public static boolean search(Node root,int val){
    if(root == null){
        return false;
    }
    if(root.data == val){
        return true;
    }

    if(root.data > val){
    return search(root.left, val);
    }
     else{
    return search(root.right, val);
    }
    
 }

    public static void main(String args[]){
        int values[]={4,5,2,1,3};
         Node root=null;
        for(int i=0 ; i<values.length ; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        // System.out.println();
        // System.out.print(search(root, 3));
    }
}