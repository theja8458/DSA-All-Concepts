import java.util.Scanner;
public class CharacterPattrn {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch='A';
        for(int row=1 ; row<=n ; row++){
            for(int i=1 ; i<=row ; i++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
