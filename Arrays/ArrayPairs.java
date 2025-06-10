public class ArrayPairs {

    public static void PrintPairs(int numbers[]){
        int tot=0;
        for(int i=0 ; i<numbers.length; i++){
            int curr=numbers[i];
            for(int j=i+1 ; j<numbers.length; j++){
                System.out.print("("+curr + ","+numbers[j]+ ")");
                tot++;
            }
            System.out.println();
        }
        System.out.println("Total pair = "+tot);
    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        PrintPairs(numbers);
    }
    
}
