public class MissingNum {
    public static void main(String args[]){
        int n = 5;
        int arr[] = {1,2,4,5};
        int sum = n*(n+1)/2;
        int sum2 = 0;
        for(int i=0 ; i<n-1 ; i++){
            sum2 += arr[i];
        }
        System.out.println("Missing number : "+(sum-sum2));
        int xor1 = 0;
        int xor2 = 0;
        for(int i=1 ; i<=n ; i++){
            xor1 = xor1 ^ i;
        }
        for(int i=0 ; i<n-1 ; i++){
            xor2 = xor2 ^ arr[i];
        }
        System.out.println(xor1 ^ xor2);
    }
}
