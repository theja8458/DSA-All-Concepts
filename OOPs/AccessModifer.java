public class AccessModifer {

    public static void main(String args[]){
        Bank myac=new Bank();
        myac.username="Theja";
        myac.setPassword("abcd");

    }
    
}

class Bank{
   public String username;
   private String password;
   public void setPassword(String pwd){
    password=pwd;
   }
}
