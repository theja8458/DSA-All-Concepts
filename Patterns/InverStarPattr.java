import java.util.Scanner;
public class InverStarPattr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=n ; row>=1 ; row--){
            for (int i=row ;i>=1 ; i--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
