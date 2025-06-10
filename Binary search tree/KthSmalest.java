import java.util.*;
public class KthSmalest {
    static class Node{
        int data;
        Node right;
        Node left;

        public Node(int d){
            this.data = d;
            left = right = null;
        }
    }   
    public static void kthsmallest(Node root,ArrayList<Integer> ans){
       if(root == null) return;

       kthsmallest(root.left, ans);
       ans.add(root.data);
       kthsmallest(root.right, ans);
    }
    public static void main(String args[]){
        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        ArrayList<Integer> ans = new ArrayList<>();
        kthsmallest(root, ans);
        System.out.println(ans.get(3-1));
    }
}
