public class BackTrackOneToN {
    static void fun(int i,int n){
        if( i<1){
            return;
        }
        fun(i-1, n);
        System.err.println(i);

    }
    static void funNtoOne(int i){
        if(i > 10){
            return;
        }
        funNtoOne(i+1);
        System.out.println(i);
    }
    public static void main(String args[]){
        int n = 10;
        fun(10,n);
        System.err.println("------------");
        funNtoOne(1);
    }   
}
