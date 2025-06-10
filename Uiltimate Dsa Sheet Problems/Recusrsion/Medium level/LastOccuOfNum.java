public class LastOccuOfNum {
    static int fun(int arr[],int i,int key){
       if(i == arr.length) return -1;

       int isFound = fun(arr, i+1, key);
       if(isFound == -1 && arr[i] == key){
        return i;
       }

       return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {5,3,5,2,5,5,5,5,5};
        int key = 5;
        System.out.println(fun(arr, 0, key));
    }
}
