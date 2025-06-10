public class Interface {

    public static void main(String args[]){
        Queens qn=new Queens();
        qn.moves();
        Rook rk=new Rook();

    }
    
}

interface Chessplayer{
    void moves();
}

class Queens implements Chessplayer{
    public void moves(){
      
        System.out.println("up, down, left, right, diagonal (in all 4 dirns)");
    }
}

class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements Chessplayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}
