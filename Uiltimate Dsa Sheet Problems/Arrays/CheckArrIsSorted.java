public class CheckArrIsSorted {
    static boolean chek(int arr[]){
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i] > arr[i-1]) continue;
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(chek(arr));
    }
}
