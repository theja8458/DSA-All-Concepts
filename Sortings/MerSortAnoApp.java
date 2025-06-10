public class MerSortAnoApp {

    public static void merg(int arr[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int L1[]=new int[n1];
        for(int i=0 ; i<n1 ; i++){
            L1[i]=arr[l+i];
        }
        int R1[]=new int[n2];
        for(int i=0 ; i<n2 ; i++){
            R1[i]=arr[mid+1+i];
        }

        int i=0, j=0;
        int k=l;

        while(i < n1 && j < n2){
            if(L1[i] < R1[j]){
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
            k++;
        }
        while(j< n2){
            arr[k]=R1[j];
            j++;
            k++;
        }
    }
      public static void sort(int arr[],int l,int r){
        if(l<r){
            int mid=(l+r)/2;

            sort(arr, l, mid);
            sort(arr, mid+1, r);
            merg(arr,l,mid,r);
        }
      }
    public static void main(String args[]){
        int arr[]={9,8,7,6,5};
        int n=arr.length;
        sort(arr,0,n-1);
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
