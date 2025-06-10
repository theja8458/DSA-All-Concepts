public class MergeSortStr {

   public static void merg(String arr[],int l,int mid,int r){

    int n1=mid-l+1;
    int n2=r-mid;
    String L1[]=new String[n1];

    for(int i=0 ; i<n2 ; i++){
        L1[i]=arr[l+i];
    }

    String R1[]=new String[n2];
    for(int i=0 ; i<n2 ; i++){
        R1[i]=arr[mid+1+i];
    } 

    int i=0,j=0;
    int k=l;
    while(i < n1 && j < n2){
        if(L1[i].compareTo(R1[j])<=0) {
            arr[k]=L1[i];
            i++;
            k++;

        }
        else{
            arr[k]=R1[j];
            j++;
            k++;
        }
    }

    while(i < n1){
        arr[k]=L1[i];
        i++;
        j++;
    }
    while(j< n2){
        arr[k]=R1[j];
        j++;
        k++;
    }
   }

   public static void sort(String arr[],int l,int r){

    if(l < r){
        int mid=(l+r)/2;
        sort(arr, l, mid);
        sort(arr, mid+1, r);

        merg(arr,l,mid,r);
    }
   }


    public static void main(String args[]){
     String arr[]={"theja","chaman","rajesh","sarath"};
     int n=arr.length;
     sort(arr,0,n-1);
     for(int i=0 ; i<n ; i++){
        System.out.print(arr[i]+" ");
     }

    }
    
}
