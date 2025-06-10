public class KthEleOfTwoSortArrs {
    public static void main(String[] args) {
        int arr1[] = {100, 112, 256, 349, 770};
        int cnt = 0;
        int arr2[] = {72, 86, 113, 119, 265, 445, 892};
        int n1 = arr1.length;
        int n2 = arr2.length;
        // int n = n1+n2;
        int i=0 , j=0;
        int k=5;
        // int ans = -1;
        while (i < n1 && j < n2) {
            int val;
            if(arr1[i] < arr2[j]){
                val = arr1[i];
                i++;
                // cnt++;
            }else{
                val = arr2[j];
                j++;
                // cnt++;
            }
            cnt++;
            if (cnt == k) {
                System.out.println(val);
                return;
            }
        }
        while (i < n1) {
            cnt++;
            if(cnt == k) {
                System.out.println(arr1[i]);
                return;
            }
            i++;
          
        }
        while (j < n2) {
            cnt++;
            if(cnt == k) {
                System.out.println(arr2[j]);
                return;
            }
                j++;
        }
        System.out.println(-1);
    }
}
