public class MaxSubAArSumn {

    public static void MaxofSubarrasum(int numbers[],int k){
        // int currsum=0;
        // int max=Integer.MIN_VALUE;
        // for(int i=0 ; i<numbers.length; i++){
        //     int start=i;
        //     for(int j=i ; j<numbers.length; j++){
        //         int end=j ; 
        //          currsum=0;
        //         for(int k=start ;k<=end ; k++){
        //             currsum+=numbers[k];
        //         }
        //         if(max<currsum){
        //             max=currsum;
        //         }
        //     }

        // }
        // System.out.println("Max sum = "+max);


        int currsum=0;
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        int count=0;
        
        for(int i=1 ; i<prefix.length ; i++){
            prefix[i]=prefix[i-1]+numbers[i];   
        }

        for(int i=0 ; i<numbers.length; i++){
            int start=i;
            for(int j=i ; j<numbers.length; j++){
                int end=j ; 
                 currsum=start==0 ? prefix[end] : prefix[end] -  prefix[start-1];
                
                
                if(max<currsum){
                    max=currsum;
                }
                if(currsum % k == 0){
                    count++;
                }
                // System.out.println(max);
            }

        }
        System.out.println("Max sum = "+max+" count = "+count);
    }

    public static void main(String args[]){
        int numbers[]={4,5,0,-2,-3,1};
        MaxofSubarrasum(numbers,5);
    }
    
}
