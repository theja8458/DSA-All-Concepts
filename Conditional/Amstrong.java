class Amstrong{
    public static void main(String[] args) {
        int n = 371;
        int dupli = n;
        int sum = 0;
        while(n > 0){
            int lastDigit = n%10;
            sum = sum+(lastDigit*lastDigit*lastDigit);
            n/= 10;
        }

        if(sum == dupli){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
    }
}