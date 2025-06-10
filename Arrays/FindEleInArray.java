public class FindEleInArray {

    public static int LinearSearch(int marks[],int key){
        for(int i=0 ; i<marks.length; i++){
            if(key==marks[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int marks[]={2,4,6,8,10,12,13,16};
        int key=10;
        int index=LinearSearch(marks,key);
        if(index == -1){
            System.out.println("Not found");
            
        }
        else{
        System.out.println("key value at index : "+index);
        }
    }
    
}
