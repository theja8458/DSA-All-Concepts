public class Swap {
    public static void main(String args[]){
        int x=9;
        int y=10;
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}
