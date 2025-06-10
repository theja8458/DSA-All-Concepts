public class Countsort {

    public static void countsort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ;i++){
            largest=Math.max(largest, arr[i]);
        }
                                              //int arr[]={1,4,1,3,2,4,3,7};f
        int count[]=new int[largest+1];
        for(int i=0 ; i<arr.length ; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0 ;i<count.length ; i++){
            while(count[i]>0){
           arr[j]=i;
           j++;
           count[i]--;
            }

        }
    }
        public static void printArray(int arr[]){
            for(int i=0 ;i<arr.length ; i++){
                System.out.print(arr[i]+" ");
            }
        }

    
    public static void main(String args[]){
        int arr[]={1,4,1,3,2,4,3,7};
        countsort(arr);
        printArray(arr);
    }
    
}
