public class LargPalind {
   public static String expand(String str,int low, int heigh ){
    while(low>=0 && heigh < str.length() && str.charAt(low) == str.charAt(heigh)){
        low--;
        heigh++;
    }
    return str.substring(low+1, heigh);
   }



    public static void main(String args[]){
        String str="abrbadaadab";
        String lps="";

        for(int i=0 ; i<str.length() ; i++){
            String odd=expand(str, i, i);
            String even=expand(str, i, i+1);

            if(odd.length() > lps.length()){
                lps=odd;
            }
            if(even.length() > lps.length()){
                lps=even;
            }

        }

        System.out.println(lps);
    
    }
    
}
