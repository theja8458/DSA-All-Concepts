public class Binary {

    public static int binary(int numbers[], int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(numbers[mid]==key){  //Found
            return mid;
            }

            if(numbers[mid]<key){   //Right
                start=mid+1;
            }

            else{
                end=mid-1;           //left
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int nunbers[]={1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5};
        int key=3;
        int index=binary(nunbers, key);
        if(index == -1){
            System.out.println("NOT found");
        }
        else{
            System.out.println("key value is at index : "+index);
        }
        // System.out.println(binary(nunbers, key));
    }
    
}
