public class LLDelAndInser {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head =  null;
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
    static Node deleteHead(Node head){
        Node temp = head.next;
        head = temp;
        return head;
    }
    static void PrintLL(Node head){
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    static Node deleteTail(Node head){
        if(head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    static Node deleteKthele(Node head,int k){
        if(head == null || head.next == null) return null;
        if(k == 1){
            head = head.next;
            return head;
        }
        Node temp = head;
        int cnt=1;
        // Node prev = null;
        while (temp != null) {
            cnt++;
            if(cnt == k){
                // prev.next = prev.next.nex;
                break;
            }
            // prev = temp;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    static Node Addfirst(Node head,int el){
        if(head == null){
            head = new Node(el);
            return head;
        }
        Node newHead = new Node(el);
        newHead.next = head;
        head = newHead;
        return head;

    }
    static Node AddLast(Node head,int val){
        if(head == null){
            head = new Node(val);
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(val);
        return head;
    }
    static Node InsertAtK(Node head , int k,int val){
        if(head == null){
            if(k==1){
                head = new Node(val);
                return head;
            }else return null;
        }
        if(k==1){
            Node newNode = new Node(val);
        newNode.next = head; // insert before current head
        return newNode;
        }
        int cnt=0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if(cnt == (k-1)){
                Node newNode = new Node(val);
                Node nextNd = temp.next;
                temp.next = newNode;
                newNode.next = nextNd;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
    static Node InsertBeforValue(Node head,int x,int el){
        if (head == null) {
            return null;
        }
        if(head.data == x){
            Node newNode = new Node(el);
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            if(temp.next.data == x){
                Node newNode = new Node(el);
                Node nextNd = temp.next;
                temp.next = newNode;
                newNode.next = nextNd;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        Node head = ConvertArrLL(arr);
        // System.out.println(deleteHead(head).data);
        // head = deleteHead(head);
        // head = deleteTail(head);
        // PrintLL(head);
        // head = deleteKthele(head, 3);
        // head = Addfirst(head,5);
        // head = AddLast(head,7);
        head = InsertBeforValue(head, 3, 5);
        PrintLL(head);

    }
}
