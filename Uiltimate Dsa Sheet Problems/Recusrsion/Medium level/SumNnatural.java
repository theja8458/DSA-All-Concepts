public class SumNnatural {

    static int SumOfNatural(int n){
        // if(n == 0) return n;
        
        // return n+SumOfNatural(n-1);

        if(n == 1) return 1;
        int sn1 = SumOfNatural(n-1);
        int sn = n+sn1;

        return sn;
    }
    public static void main(String[] args) {
        System.out.println(SumOfNatural(5));
    }
}
