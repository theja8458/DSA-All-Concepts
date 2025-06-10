class SingleNum{
    public static void main(String args[]){
        int arr[] = {1,1,2,3,3,4,4};
        int n = arr.length;
        int max = arr[0];
        for(int i=0 ; i<n ; i++){
           max  =Math.max(arr[i],max);
        }
        int hash[] = new int[max+1];
        for(int i=0 ; i<n ; i++){
            hash[arr[i]]++;
        }

        for(int i=0 ; i<n ; i++){
            if(hash[arr[i]] == 1) {
                System.out.println("Single number in array is : "+arr[i]);
            }
        }
      int xor = 0;
      for(int i=0 ; i<n ; i++){
        xor ^= arr[i];
      }
      System.out.println(xor);
    }
}