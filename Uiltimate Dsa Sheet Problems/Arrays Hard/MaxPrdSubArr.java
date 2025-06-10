public class MaxPrdSubArr {
    public static void main(String[] args) {
        int arr[] = {2,3,-2,4};
        int n = arr.length;
        int max = 0;
        for(int i=0 ; i<n ; i++){
            int prd = 1;
            for(int j=i ; j<n ; j++){
               prd = prd*arr[i];
                max = Math.max(prd,max);
                
            }
        }
        System.out.println(max);

        int suffix = 1;
        int prefix = 1;
        int maxPrd = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            prefix = prefix*arr[i];
            maxPrd = Math.max(maxPrd , prefix);
            if(prefix == 0) prefix = 1;
        }
        for(int i=n-1 ; i>=0 ; i--){
            suffix = suffix*arr[i];
            maxPrd = Math.max(suffix , maxPrd);
            if(suffix == 0) suffix = 1;
        }
     System.out.println(maxPrd);
    }
}
