// import java.util.HashSet;
// import java.util.TreeSet;

// public class RemoveDuplicates {
//     static void Duplicates(int arr[]){
//         TreeSet<Integer> set = new TreeSet<>();
//         for(int i=0 ; i<arr.length ; i++){
//             set.add(arr[i]);
//         }
//         int i=0;
//         for(int num:set){
//             // int temp = num;
//             arr[i] = num;
//             i++;
//         }
//     }
//     static void DuplicatesOpt(int arr[]){
//         int i=0 ;
//         for(int j=1 ; j<arr.length ; j++){
//             if(arr[j] != arr[i]){
//                 arr[i+1] = arr[j];
//                 i++;
//             }
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {1,1,2,2,2,3,3};
//         // Duplicates(arr)
//         DuplicatesOpt(arr);;
//         for(int i=0 ; i<arr.length ; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
