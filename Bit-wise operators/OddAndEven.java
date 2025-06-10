public class OddAndEven {


    public static void EvenOrOdd(int n){
        int bitmask=1;
        if((n & bitmask) == 0){
            System.out.println(n+" = even");
        }else{
            System.out.println(n+" = odd");
        }
    }
    public static void main(String args[]){
        EvenOrOdd(9);
        EvenOrOdd(10);
        EvenOrOdd(7);
        EvenOrOdd(20);
        
    }
    
}
