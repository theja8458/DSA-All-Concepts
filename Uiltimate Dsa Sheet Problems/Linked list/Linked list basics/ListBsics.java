class ListBasics{
   static class Node{
        int data;
        Node next;

         Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;
    static Node tail = null;
    
    static Node ConvertArrLL(int arr[]){
        head = new Node(arr[0]);
        Node mover = head;
        for(int i=1 ; i<arr.length ; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }
        return head;
    }
    static void PrintLL(Node head){
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    static int lengthLL(Node head){
        int cnt = 0;
       while (head != null) {
        cnt++;
        head = head.next;
       }
       return cnt;
    }
    static boolean CheckPreOrNot(Node head,int val){
         while (head != null) {
            if(head.data == val) return true;
            head = head.next;
         }
         return false;
    }
    public static void main(String[] args) {
        Node x = new Node(2);
        System.out.println(x.data);
        int arr[] = {2,5,8,7};
    //   System.out.println(ConvertArrLL(arr).data);
    Node temp = ConvertArrLL(arr);
    PrintLL(temp);
    System.out.println(lengthLL(temp));
    System.out.println(CheckPreOrNot(temp, 10));
    }
}