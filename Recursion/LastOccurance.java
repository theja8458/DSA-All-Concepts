public class LastOccurance {

    public static int lastocc(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isfound=lastocc(arr, key, i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
    }


    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
        int key=5;
        int i=0;
        System.out.println(lastocc(arr, key, i));
    }
    
}
