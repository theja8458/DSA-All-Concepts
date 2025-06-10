public class ReversePairs {
   static int count = 0;
    static void merge(int a[], int l, int m, int r)
    {

      	int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];

      	for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];

        // Merge the temp arrays
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            }
            else {
                a[k] = R[j];
                // countInver += (n1 - i);
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

    static void countPairs(int arr[],int low,int mid,int high){
        int right = mid+1;
        for(int i=low ; i<=mid ; i++){
        while (right <= high && (long)arr[i] > (long)arr[right]*2L) {
           right++;       
        }
        count += (right-(mid+1));
    }
    }

    // Main function that sorts a[l..r] using
    // merge()
    static void sort(int a[], int l, int r)
    {
        if (l < r) {
          
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(a, l, m);
            sort(a, m + 1, r);
            countPairs(a , l , m , r);
            // Merge the sorted halves
            merge(a, l, m, r);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,3,5,1};
        int n = arr.length;
        // int count = 0;
        // for(int i=0 ; i<n ; i++){
        //     for(int j=i+1 ; j<n ; j++){
        //         if(arr[i] > arr[j]*2){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);
        sort(arr, 0, n-1);
        System.out.println(count);
    }
}
