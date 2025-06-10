import java.util.*;
public class MaxPrdAmonThreeNums {
    public static void main(String[] args) {
        int arr[] = {-100,-98,-1,2,3,4};
        int max = Integer.MIN_VALUE;
       int first = arr[0]*arr[1]*arr[arr.length-1];
       int second = arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3];

       System.out.println(Math.max(first , second));
    }
}
