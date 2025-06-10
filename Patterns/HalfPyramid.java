import java.util.Scanner;
public class HalfPyramid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1 ; row<=n ; row++){
            for(int i=0 ; i<=n-row ; i++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}
