public class MedianOFTwoSortArrs {
    static double median(int arr1[] , int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n = n1+n2;
        int ind2 = n/2;
        int ind1 = ind2-1;
        int cnt = 0;
        int ind1el = -1 , ind2el=-1;
        int i=0 , j=0;
        while (i<n1 && j<n2) {
            if(arr1[i] < arr2[j]){
                if(cnt == ind1) ind1el = arr1[i];
                if(cnt == ind2) ind2el = arr1[i];
                i++;
                cnt++;
            }else{
                if(cnt == ind1) ind1el = arr2[j];
                if(cnt == ind2) ind2el = arr2[j];
                j++;
                cnt++;
            }
        }
        while (i < n1) {
            if(cnt == ind1) ind1el = arr1[i];
            if(cnt == ind2) ind2el = arr1[i];
            i++;
            cnt++;
        }
        while (j < n2) {
            if(cnt == ind1) ind1el = arr2[j];
                if(cnt == ind2) ind2el = arr2[j];
                j++;
                cnt++;
        }

        if(n%2 == 1){
            return ind2el;
        }

        return (double)((double)(ind1el+ind2el))/2.0;
    }
   public static void main(String[] args) {
    int arr1[] ={1,3,4,7,10,12};
    int arr2[] = {2,3,6,15};
    // int n1 = arr1.length;
    // int n2 = arr2.length;
    // int arr[] = new int[n1+n2];
    // int i=0 , j=0;
    // int k=0;
    // while (i < n1 && j<n2) {
    //     if(arr1[i] <= arr2[j]){
    //         arr[k] = arr1[i];
    //         i++;
    //         k++;
    //     }else{
    //         arr[k] = arr2[j];
    //         j++;
    //         k++;
    //     }
    // }
    // while (i<n1) {
    //     arr[k++] = arr1[i++];
    // }
    // while (j<n2) {
    //     arr[k++] = arr2[j++];
    // }
    // int mid = arr.length/2;
    // if(arr.length %2 == 0){
    //     System.out.println((arr[mid]+arr[mid-1])/2);
    // }else{
    //     System.out.println(arr[mid]);
    // }
    System.out.println(median(arr1, arr2));
   }   
}
