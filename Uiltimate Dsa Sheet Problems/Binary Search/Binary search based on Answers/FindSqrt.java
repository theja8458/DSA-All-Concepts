class FindSqrt{
    public static void main(String[] args) {
        int n = 28;
        int ans=1;
        for(int i=1 ; i<=n ; i++){
            if(i * i <= n){
                ans = i;
            }else{
                break;
            }
        }
        System.out.println(ans);

        ans = 1;
        int low = 1 , high = n;
        while(low <= high){
            int mid = (low+high)/2;
            if(mid*mid <= n){
                ans = mid;
                low= mid+1;
            }else{
                high  = mid-1;
            }
        }
        System.err.println(ans);
    }
}