public class QuickSortTwo {
    
    public static int pivot(int arr[],int l,int r){
        int pivot=arr[r];
        int i=l;
        for(int j=l ; j<r ; j++){
            if(arr[j] <= pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;

            }
        }
        int temp=arr[i];
        arr[i]=arr[r];
        arr[r]=temp;
        return i;
    }
  public static void quicksort(int arr[],int l,int r){
           
    if(l >= r){
        return;
    }
                int pivotval=pivot(arr, l, r);
                quicksort(arr, l, pivotval-1);
                quicksort(arr, pivotval+1, r);

  }
    public static void main(String args[]){
        int arr[]={70,80,30,20,60,40,10,50};
        quicksort(arr,0,arr.length-1);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
