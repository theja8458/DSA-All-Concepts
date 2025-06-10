public class SubArraySum {
    

    public static void SubArrSum(int numbers[]){
    
        for(int i=0 ; i<numbers.length ;i++){
            int TotSum=0;
            int start=i;
           
            for(int j=i ; j<numbers.length ; j++){
                int end=j;
                int sum=0;
                
                for(int k=start ; k<=end ; k++){
                    sum+=numbers[k];
                }
                TotSum+=sum;
            }
            System.out.print(TotSum+" ");
        }
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        SubArrSum(numbers);
    }
    
}
