class FindMissAndRepeaNum{
    public static void main(String[] args) {
        int arr[] = {4,3,6,2,1,1};
        int n = arr.length;
        int missingNum = -1 , repeatNum = -1;
        for(int i=1 ; i<=n ; i++){
            int count = 0;
            for(int j=0 ; j<n ; j++){
                if(arr[j] == i){
                    count++;
                }
            }
            if(count == 2){
                repeatNum = i;
            }else if(count == 0){
                missingNum = i;
            }
            if(missingNum!=-1 && repeatNum != -1) break;
            
        }
        System.out.println(missingNum+" "+repeatNum);
         
        missingNum = -1 ;
         repeatNum = -1;
        int hasharr[] = new int[n+1];
        for(int i=0 ; i<n ; i++){
            hasharr[arr[i]]++;
        }
        for(int i=1 ; i<n ; i++){
            if(hasharr[i] == 2) repeatNum = i;
            else if(hasharr[i] == 0) missingNum = i;
        }
        System.out.println(missingNum+" "+repeatNum);

        int x = -1;
        int y = -1;
        int Sn = n*(n+1)/2;
        int S = 0;
        int S2n = (n*(n+1)*(2*n+1))/6;
        int S2 = 0;
        for(int i=0 ; i<n ; i++){
            S += arr[i];
            S2 +=arr[i]*arr[i];
        }
        int val1 = S- Sn; //x - y
        int val2 = S2 - S2n; // x + y
        val2 = val2/val1;
        x = (val1+val2)/2;
        y = val2-x;
        System.out.println(y+" "+x);



    }
}