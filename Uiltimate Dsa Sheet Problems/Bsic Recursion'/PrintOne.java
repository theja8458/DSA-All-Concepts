class PrintOne{
    static int count = 1;
    static void fun(){
        if(count > 10) return;
        System.err.println(count);
        count++;
        fun();
    }
    public static void main(String args[]){
      fun();
    }
}