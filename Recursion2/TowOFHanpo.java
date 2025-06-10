public class TowOFHanpo {
    public static void tow(int n,int A,int C,int B){
        if(n==0){
            return;
        }
        tow(n-1, A, B, C);
        System.out.println("Move "+n+" disk from "+A+" to "+C);
        tow(n-1,B,C,A);
    }




    public static void main(String args[]){
    tow(3, 10, 30, 20);
    }
    
}
