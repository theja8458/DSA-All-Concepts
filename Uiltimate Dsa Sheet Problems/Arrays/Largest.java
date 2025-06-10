public class Largest {
    public static void main(String args[]){
        int arr[] = {1,3,2,5,2};
        int largest = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
