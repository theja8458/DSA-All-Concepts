public class MajorityElem {
    
    public static int majorityele(int arr[]){
        int cand=0,point=0;
        for(int i=0 ; i<arr.length ; i++){
            if(point == 0){
                cand=arr[i];
            }
            if(cand == arr[i]){
                point++;
            }
            else{
                point--;
            }

            
        }
        return cand;
    }


    public static void main(String args[]){
        int arr[]={2,2,1,1,1,2,2};
        System.out.println(majorityele(arr))    ;
    }
}
