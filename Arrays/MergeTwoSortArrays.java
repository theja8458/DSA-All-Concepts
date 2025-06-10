public class MergeTwoSortArrays {
    public static void main(String args[]){
    int A[]={1,2,3};
    int B[]={2,5,6};
    int arr[]=new int[A.length + B.length];
    int l1=0;
    int r1=0;
    int k=0;
    while(l1 < A.length && r1 < B.length){
          if(A[l1] <= B[r1]){
            arr[k] = A[l1];
            l1++;
            
          }else{
            arr[k]=B[r1];
            r1++;
            
          }
          k++;
    }
    while(l1 < A.length){
      arr[k]=A[l1];
      k++;
      l1++;
    }
    while(r1 < B.length){
      arr[k]=B[r1];
      k++;
      r1++;
    }

    for(int i=0 ; i<arr.length ; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
}