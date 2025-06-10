import java.util.*;
class BinTree{
    static class  Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    
        
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode=new Node(nodes[idx]);
            newNode.left=buildtree(nodes);
            newNode.right=buildtree(nodes);
            return newNode;
        }

        public static void preorder(Node root){
            if(root == null){
                // System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root == null){
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        public static void levelorder(Node root){
            if(root == null ){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currnod=q.remove();
                if(currnod == null){
                    System.err.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currnod.data+" ");
                    if(currnod.left != null){
                        q.add(currnod.left);
                    }
                    if(currnod.right!=null){
                        q.add(currnod.right);
                    }
                }
            }
            
        }
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=BinaryTree.buildtree(nodes);

        BinaryTree.preorder(root);
        System.out.println();
        BinaryTree.inorder(root);
        System.err.println();
        BinaryTree.postorder(root);
        System.out.println();
        BinaryTree.levelorder(root);
    }

}