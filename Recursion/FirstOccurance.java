public class FirstOccurance {

     public static int fistocc(int arr[],int i,int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return fistocc(arr, i+1,key);
     }

    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
        int key=5;
        int i=0;
       System.out.println(fistocc(arr, i, key));

    }
    
}
