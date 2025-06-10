class InversCount{
     public static int merge(int arr[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
         int L1[]=new int[n1];
        for(int i=0 ; i<n1  ; i++){
           L1[i]=arr[l+i];
        }
        int R1[]=new int[n2];
        for(int i=0 ;i< n2 ; i++){
            R1[i]=arr[mid+1+i];
        }

        int i=0,j=0;
        int count=0;
        int k=l;

        while(i < n1 && j<n2){
            if(L1[i] < R1[j]){
                arr[k]=L1[i];
                i++;
                k++;
            }else{
                count+=(n1-i);
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

        while(j < n2){
            arr[k]=R1[j];
            j++;
            k++;
        }
        return count;
     }



    public static  int inver(int arr[],int l,int r){
        int count=0;
        if(l < r){
            int mid=(l+r)/2;
            count+=inver(arr, l, mid);
            count+=inver(arr, mid+1, r);
            count+=merge(arr,l,mid,r);
        }
        return count;
    }
    public static void main(String args[]){
        int arr[]={2, 4, 1, 3, 5};
        int count=inver(arr,0,arr.length-1);
        // for(int i=0 ; i<arr.length-1 ; i++){
        //     for(int j=i+1 ; j<arr.length ; j++){
        //         if(i< j && arr[i] > arr[j]){
        //             count++;
        //         }
        //     }
        // }
        System.out.println(count);
    }
}