public class PrintNameNTimes {
    static void fun(int i,int n){
        if(i > n){
            return;
        }
        System.out.println("Theja");
        fun(i+1, n);
    }
    public static void main(String args[]){
        fun(1,5);
    }
}
