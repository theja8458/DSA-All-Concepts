class TilingRec{

    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }

        // //vertical
        // int Vertical=tiling(n-1);
        // //horizontal
        // int Horizontal=tiling(n-2);
        // int totalways=Vertical+Horizontal;
        // return totalways;
        return tiling(n-1)+tiling(n-2);
    }
    public static void main(String args[]){
        int n=3;
        System.out.println(tiling(n));
    }
}