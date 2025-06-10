public class FirstOccurIndces {
    
 public static void occind(int num[],int i, int key){
    if(i == num.length){
        // System.out.println();
        return;
    }
    if(num[i] == key){
        System.out.print(i+" ");
    }
    occind(num, i+1, key);
 }



    public static void main(String args[]){
    int num[]={3, 2, 4, 5, 6, 2, 3, 2, 2};
    occind(num, 0, 3);
    }
    
}
