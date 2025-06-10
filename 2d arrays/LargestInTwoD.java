import java.util.Scanner;
public class LargestInTwoD {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int largest=Integer.MIN_VALUE;
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(largest<matrix[i][j]){
                    largest=matrix[i][j];
                }
            }
        }
        System.out.println("Largest nubmer ="+largest);
        
        
    }
    
}
