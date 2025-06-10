public class MoveZeros {

    public static void main(String args[]){
        int arr[]={0,1,0,3,12};
        int numszeroindex=0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] != 0){
                arr[numszeroindex] = arr[i];
                numszeroindex++;
            }
        }
        for(int i=numszeroindex ; i<arr.length ;i++){
            arr[i]=0;
        }

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
