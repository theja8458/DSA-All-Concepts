public class NthRootofM {
    static int check(int mid , int n,int m ){
        int ans = 1;
        for(int i=1 ; i<=n ; i++){
            ans = ans*mid;
            if(ans > m) return 2;
        }
        if(ans == m) return 1;
        return 0;
    }
    public static void main(String[] args) {
        int n =3 , m=27;
        int low = 1 , high = m;
        while(low <= high){
            int mid = (low+high)/2;
            if(check(mid , n,m) == 1){
               System.out.println(mid);
               return;
            }else if(check(mid , n,m) == 0){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println(-1);
    }
}
