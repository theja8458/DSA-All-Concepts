public class DecToBina {

    public static void DectoBin(int n){
        int pow=0;
        int bin=0;
        int dec=n;
        while(n>0){
            int rem=n%2;
            
             bin=bin+(rem*(int)Math.pow(10 , pow));
             pow++;
             n/=2;
        }
        System.out.println("Binary of "+dec+" = "+bin);
    }
        public static void main(String args[]){
          DectoBin(11);

        }
    }
    

