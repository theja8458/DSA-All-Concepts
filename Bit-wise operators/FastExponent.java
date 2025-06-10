public class FastExponent {

 public static int fastexponent(int a,int n){
    int ans=1;
    while(n>0){
        if((n &1 ) !=0){ //check lsb
            ans=ans*a;
        }
        a=a*a;
        n=n>>1;
    }
    return ans;

 }


    public static void main(String args[]){

        System.out.println(fastexponent(3, 5));
        System.out.println(fastexponent(5, 3));

    }
    
}
