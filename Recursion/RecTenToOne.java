class RecTenToOne{
    public static void prindecrease(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        prindecrease(n-1);
    }
    public static void printincrase(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printincrase(n-1);
        System.out.print(n+" ");
    }
    public static void main(String arga[]){
        int n=10;
        prindecrease(n);
        System.out.println();
        printincrase(n);
    }

}