public class WordSearch {
        static  boolean exist(char[][] board, String word) {
            int m = board.length;
            int n = board[0].length;
            for(int r=0 ; r<m ; r++){
                for(int c=0 ; c<n ; c++){
                if(word.charAt(0) == board[r][c]){
                   boolean found =  dfs(board,r,c,word,0);
                   if(found) return true;
                }
                }
            }
            return false;
           
        }
    
        static boolean dfs(char[][] board,int r,int c, String word,int wi){
            if(wi == word.length()) return true;
            
            int rows = board.length;
            int cols = board[0].length;
            if(r<0 || r>=rows || c<0 || c>=cols ){
                return false;
            }
    
            if(board[r][c] == ' ' || board[r][c] != word.charAt(wi)){
                return false;
            }
            char ch = board[r][c];
            board[r][c] = ' ';
           
            if( dfs(board, r-1, c, word, wi+1)|| 
            dfs(board, r, c+1, word, wi+1)|| 
            dfs(board, r+1, c, word, wi+1)||
            dfs(board, r, c-1, word, wi+1) ){
                return true;
            }
            board[r][c] = ch;
            return false;
        }
    }

