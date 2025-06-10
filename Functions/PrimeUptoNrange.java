public class PrimeUptoNrange {

    public static boolean isprime(int n){
        for(int i=2  ; i<=Math.sqrt(n) ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
        public static void Primerange(int n){
            for(int i=2 ; i<=n ; i++){
                if(isprime(i)){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
        public static void main(String args[]){
        Primerange(20);
        Primerange(30);


        }
    }