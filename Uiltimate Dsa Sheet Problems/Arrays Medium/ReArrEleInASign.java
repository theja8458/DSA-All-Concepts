public class ReArrEleInASign {
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        int n = arr.length;
        int ans[] = new int[n];
        int pos = 0;
        int neg = 1;
        int i=0;
        while(neg < n){
            if(arr[i] > 0){
                ans[pos] = arr[i];
                i++;
                pos+=2;
            }else{
                ans[neg] = arr[i];
                i++;
                neg+=2;
            }
        }
        for(int k=0 ; k<n ; k++){
         System.out.print(ans[k]+" ");
        } 
    }
}
