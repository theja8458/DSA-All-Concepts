public class PrdOfArrExpecItself {
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        int ans[] = new int[arr.length];
        ans[0]= 1;
        for(int i=1 ; i<arr.length ; i++){
            ans[i] = ans[i-1]*arr[i-1]; 
        }

        int suffic = 1;
        for(int i=arr.length-2 ; i>=0 ; i--){
            suffic *= arr[i+1];
            ans[i] *= suffic;
        }

        for(int i=0  ; i<ans.length ; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
