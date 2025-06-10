public class PrintOneToTen {
    static void fun(int i,int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        fun(i+1, n);
    }
    static void funNtoOne(int i,int n){
        if(n<i){
            return;
        }
        System.out.println(n);
        funNtoOne(i, n-1);
    }
    public static void main(String args[]){
        int n = 10;
        fun(1,n);
        System.err.println("__________________");
        funNtoOne(1, n);
    }
}
