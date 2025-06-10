import java.util.Scanner;
class StarPattrn{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1 ; row<=n ; row++){
            for(int i=1 ; i<=row ; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}