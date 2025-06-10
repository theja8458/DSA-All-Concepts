public class SubsetSum {
    static boolean subsetsum(int arr[],int i,int target,int sum){
        if( i == arr.length){
         return sum == target;
        }
        sum+=arr[i];
        if(subsetsum(arr, i+1, target, sum)) return true;;
        sum -= arr[i];
        if(subsetsum(arr, i+1, target, sum)) return true;
        return false;
    }
 public static void main(String[] args) {
    int arr[] = {3, 34, 4, 12, 5, 2};
    int target = 9;
    System.out.println(subsetsum(arr, 0, target, 0));

 }   
}
