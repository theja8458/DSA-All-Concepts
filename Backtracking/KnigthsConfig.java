public class KnigthsConfig {
    static boolean isSafe(int x,int y,int sol[][]){
        if(x >=0 && x<8 && y>=0 && y<8 && sol[x][y] == -1){
            return true;
        }
        return false;
    }
    static void printSolution(int sol[][]){
       
        for(int i=0 ; i<8 ; i++){
            for(int j=0 ; j<8 ; j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }

    static boolean solveKnight(int x,int y,int move,int sol[][],int dx[],int dy[]){

        int k,newX,newY;
        if(move == 8*8){
            return true;
        }

        for(k=0 ; k<8 ; k++){
            newX=x+dx[k];
            newY=y+dy[k];

           if( isSafe(newX, newY, sol)){
               sol[newX][newY]=move;
               if(solveKnight(newX, newY, move+1, sol, dx, dy)){
                return true;
               }else{
                sol[newX][newY]=-1;
               }
            }
        }
        return false;
    }
    static boolean solveKt(){
        int sol[][]=new int[8][8];

        for(int x=0 ; x<8 ; x++){
            for(int y=0 ; y<8 ; y++){
                sol[x][y]=-1;
            }
        }

        int dx[]={2,1,-1,-2,-2,-1,1,2};
        int dy[]={1,2,2,1,-1,-2,-2,-1};

        sol[0][0]=0;
        if(!solveKnight(0,0,1,sol,dx,dy)){
            System.out.println("Solution does not exit");
            return false;
        }else{
            printSolution(sol);
            return true;
        }
    }

    public static void main(String args[]){
        solveKt();
    }
}
