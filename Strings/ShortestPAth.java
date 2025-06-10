public class ShortestPAth {
 
    public static float shortpath(String str){
        int x=0,y=0;
        for(int i=0 ; i<str.length() ; i++){
            char dir=str.charAt(i);
            if(dir == 'S'){            //String path="WNEENESENNN";
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String args[]){
        String path="WNEENESENNN";
        System.out.println(shortpath(path));
    }
    
}
