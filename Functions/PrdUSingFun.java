public class PrdUSingFun {
    public static int ClacProdu(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String args[]){
        // int a=5;
        // int b=10;
        int product=ClacProdu(5,3);
        System.out.println("a * b = "+product);
        product=ClacProdu(10, 10);
        System.out.println("a * b = "+product);

    }
    
}
