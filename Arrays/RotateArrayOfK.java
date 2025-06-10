public class RotateArrayOfK {

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int start=0;
        
        int last=arr.length-1;
        while(start < last){
            int temp=arr[last];
            arr[last]=arr[start];
            arr[start]=temp;
            start++;
            last--;
        }
        int len=arr.length;
        int k=3%len;
        int i=0;
        int a=k;
        while(i<a){
            int temp=arr[a-1];
            arr[a-1]=arr[i];
            arr[i]=temp;
            i++;
            a--;
        }
            int n=arr.length-1;
            while(k<n){
                int temp=arr[n];
                arr[n]=arr[k];
                arr[k]=temp;
                k++;
                n--;
            }

        for(int j=0 ; j<arr.length ; j++){
            System.out.print(arr[j]+" ");
        }
    }
    
}
