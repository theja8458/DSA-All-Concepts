
    public class Arrayargume {

    public static void update(int arr1[]){

        // for(int i=0 ; i<marks.length; i++){
        //     marks[i]=marks[i]+1;

        // }
        for(int i=0,j=1 ; i<arr1.length-1 ; i++,j++){
            if(arr1[j]>arr1[i]){
                arr1[i]=arr1[j];
            }
            
        }
        for(int i=0 ; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }

    }
    
    public static void main(String args[]){
        int marks[]={90,80,78};
        // update(marks);
        // for(int i=0 ; i<marks.length; i++){
        //     System.out.print(marks[i]+" ");
        // }
        // System.out.println();
        update(marks);
    }
}
