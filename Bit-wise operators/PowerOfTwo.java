public class PowerOfTwo {

    public static boolean poweof2(int n){
        return (n&(n-1)) == 0;
    }

    public static void main(String args[]){
        System.out.println(poweof2(4));
    }
    
}
