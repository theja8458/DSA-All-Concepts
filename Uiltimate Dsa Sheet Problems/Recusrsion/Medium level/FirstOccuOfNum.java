public class FirstOccuOfNum {
    static int fun(int arr[],int ind,int key){
        if(ind == arr.length) return -1;

        if(arr[ind] == key){
            return ind;
        }
        return fun(arr, ind+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {8,1,6,9,5,10,2,5,3};
        int key = 11;
        System.out.println(fun(arr, 0, key));
    }
}
