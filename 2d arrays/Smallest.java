import java.util.Scanner;

public class Smallest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int smallest=Integer.MAX_VALUE;
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(smallest>matrix[i][j]){
                    smallest=matrix[i][j];
                }
            }
        }
        System.out.println("Smallest nubmer ="+smallest);
        
        
    }
}
