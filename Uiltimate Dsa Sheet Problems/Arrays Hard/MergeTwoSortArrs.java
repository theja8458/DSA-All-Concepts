import java.util.*;
public class MergeTwoSortArrs {
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7};
        int arr2[] = {0,2,6,8,9};
        int ans[] = new int[arr1.length+arr2.length];
        int n = arr1.length;
        int m = arr2.length;
        int leftt = 0;
        int right = 0;
        int i=0;
    //     while (leftt < n && right < m) {
    //         if(arr1[leftt] <= arr2[right]){
    //             ans[i] = arr1[leftt];
    //             leftt++;
    //         }else{
    //             ans[i] = arr1[right];
    //             right++;
    //         }
    //         i++;
    //     }
    //     while (leftt < n) {
    //         ans[i] = arr1[leftt];
    //         leftt++;
    //         i++;
    //     }
    //     while (right < m) {
    //         ans[i] = arr2[right];
    //         right++;
    //         i++;
    //     }
    // //    int index = 0;
    //     for(int j=0 ; j<ans.length ; j++){
    //         if(j < n){
    //             arr1[j] = ans[j];
    //         }else{
    //             arr2[j - n] = ans[j];
    //         }
    //     }
    //   System.err.println(Arrays.asList(arr1));
    //   System.err.println(Arrays.asList(arr2));

      int left = n-1;
          right = 0;
          while (left >= 0 && right < m) {
            if(arr1[left] > arr2[right]){
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }else{
                break;
            }
        }

       Arrays.sort(arr1);
       Arrays.sort(arr2);
         print(arr1);
         print(arr2);

    }
    static void print(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
