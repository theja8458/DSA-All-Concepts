public class KadensAlgo {

    public static void kadels(int numbers[]){
        int currsum=0;
        int max=Integer.MIN_VALUE;
        for(int i= 0 ; i<numbers.length; i++){
            currsum+=numbers[i];
            if(currsum<0){
                currsum=0;
            }
            max=Math.max(max, currsum);
        }
        System.out.println("max number = "+max);
    }
    public static void main(String args[]){
        int numbersp[]={1,-2,6,-1,3};
        kadels(numbersp);
    }
    
}
