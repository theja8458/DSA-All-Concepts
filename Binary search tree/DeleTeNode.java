import java.util.*;
public class DeleTeNode {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data=data;
        }
    }

    public static Node insert(Node root,int data){
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(root.data > data){
            root.left =  insert(root.left, data);
        }else{

            root.right=insert(root.right, data);
        }

        return root;

    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
       public static Node delete(Node root,int val){

         if(root.data > val){
            root.left=delete(root.left, val);
        }else if(root.data < val){
            root.right=delete(root.right, val);
        }
        else{
             //case 1;
            if(root.left == null && root.right == null){
                return null;
            }

           if(root.left == null){
            return root.right;
           }else if(root.right == null){
            return root.left;
           }

           Node IS=findInorderSuccessor(root.right);

           root.data = IS.data;
           root.right=delete(root.right, IS.data);

        }

        return root;
       }


       public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }

        return root;
       }

       public static void PrintInRange(Node root,int k1,int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            PrintInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            PrintInRange(root.right, k1, k2);
            // System.out.print(root.data,k1,k2);
        }
        else if(root.data < k1){
            PrintInRange(root.left,k1,k2);
        }

        else{
            PrintInRange(root.right,k1,k2);
        }
       }
    
       public static void printpath(ArrayList<Integer> list){
        for(int i=0 ; i<list.size() ; i++){
            System.out.print(list.get(i)+"-->");
        }
        System.out.println("Null");
       }


       public static void RootToLeaf(Node root,ArrayList<Integer> path){

        if(root == null){
            return;
        }

        path.add(root.data);
            if(root.left == null && root.right == null){
                printpath(path);
            }
        RootToLeaf(root.left, path);
        RootToLeaf(root.right, path);
        path.remove(path.size()-1);
       }


       public static boolean isValidBST(Node root,Node min,Node max){
        if(root == null){
            return true;
        }

        if(min != null  && root.data <= min.data){
            return false;
        }else if(max != null && root.data >= max.data){
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
       }
    public static void main(String args[]){
        int values[]={8,5,3,1,4,6,10,11,14};
        // int values[]={8,5,3,6,10,11,14};

        Node root=null;

        for(int i=0 ; i <values.length ; i++){
            root=insert(root, values[i]);
        }
        inorder(root);
        // root=delete(root, 1);
        // root = delete(root, 10);
        System.out.println();
        // inorder(root);

        PrintInRange(root,5,11);
        // RootToLeaf(root, new ArrayList<>());
        // System.out.println(isValidBST(root, null, null));
    }
}
