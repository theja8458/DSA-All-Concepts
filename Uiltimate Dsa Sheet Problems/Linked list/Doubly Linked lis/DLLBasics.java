class DLLBasics{
    static class Node{
        int data;
        Node next;
        Node back;

        Node(int data){
            this.data = data;
            this.next = null;
            this.back = null;
        }
    }
    static Node head = null;
    static Node ConvertArrtoDll(int arr[]){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1 ; i<arr.length ; i++){
            Node temp = new Node(arr[i]);
           prev.next = temp;
           temp.back=prev;
           prev=temp;
        }
        return head;
    }
    static void PrintDll(Node head){
      while (head != null) {
        System.out.print(head.data+" ");
        head= head.next;
      }
    }

    static Node delteHead(Node head){
        if(head == null || head.next == null) return null;
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
    }
    static Node deleteTail(Node head){
        if(head == null || head.next == null) return null;
        Node temp = head;
        // Node prev=null;
        while (temp.next != null) {
            // prev = temp;
            temp = temp.next;
        }
        Node prev = temp.back;
        temp.back = null;
        prev.next = null;
        return head;
    }
    
    static Node deleteAtk(Node head,int k){

        Node tepm=head;
        int cnt=0;
        while (tepm != null) {
            cnt++;
            if (cnt == k) {
                break;
            }
            tepm = tepm.next;
        }
        Node nextNd = tepm.next;
        Node prev = tepm.back;
        if(nextNd == null && prev == null) return null;
        else if(prev == null) return delteHead(head);
        else if(nextNd == null) return deleteTail(head);
        else{
            prev.next = nextNd;
            nextNd.back = prev;
            tepm.next = null;
            tepm.back = null;
        }
        return head;
    }
    static void deleteNode(Node temp){
        Node prev = temp.back;
        Node front = temp.next;
        if (front == null) {
            prev.next = null;
            temp.back = null;
            return;
        }
        prev.next = front;
        front.back = prev;

        temp.next = null;
        temp.back = null;
    }
    public static void main(String args[]){
     int arr[] = {1,2,3,4};
     Node head = ConvertArrtoDll(arr);
    //  head = delteHead(head);
    // head = deleteTail(head);
    // head = deleteAtk(head, 1);
    deleteNode(head.next);
     PrintDll(head);
     
    }
}