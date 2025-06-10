class PascalsTriangle{
    static int funNcR(int n,int r){
        int res = 1;
        for(int i=0 ; i<r ; i++){
            res = res*(n-i);
            res = res/(i+1);
        }

        return res;
    }
    static void NthRow(int n){
        int ans = 1;
        System.out.print(ans+" ");
        for(int c=1 ; c<n ; c++){
          ans = ans*(n-c);
          ans = ans/c;
          System.out.print(ans+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println(funNcR(4,2));
       NthRow(5);
    }
}