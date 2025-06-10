public class SetithBit {

    public static int setithbit(int n,int i){
        int bitmas=1<<i;
    return n | bitmas;
    }

    public static void main(String args[]){
        System.out.println(setithbit(10, 2));
    }
    
}
