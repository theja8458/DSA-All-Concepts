import java.util.*;
public class FourSum {
    public static void main(String[] args) {
        int arr[] = {1,0,-1,0,-2,2};
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n = arr.length;
        //brute;


        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                for(int k=j+1 ; k<n ; k++){
                    for(int l=k+1 ; l<n ; l++){
                        if(arr[i]+arr[j]+arr[k]+arr[l] == 0){
                          int tepm[] = {arr[i],arr[j],arr[k],arr[l]};
                          Arrays.sort(tepm);
                          set.add(Arrays.asList(tepm[0],tepm[1],tepm[2],tepm[3]));
                        }
                    }
                }
            }
        }
        ans = new ArrayList<>(set);
        System.out.println(ans);

        set = new HashSet<>();
        ans = new ArrayList<>();
        
        Set<Integer> hs = new HashSet<>();
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                hs = new HashSet<>();
                for(int k=j+1 ; k<n ;k++){
                    int l = 0-(arr[i]+arr[j]+arr[k]);
                    if(hs.contains(l)){
                        int temp[] = {arr[i],arr[j],arr[k],l};
                        Arrays.sort(temp);
                        set.add(Arrays.asList(temp[0],temp[1],temp[2],temp[3]));
                    }
                    hs.add(arr[k]);
                }
            }
        }
        System.out.println(set);
        Arrays.sort(arr);
        ans = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            for(int j=i+1 ; j<n ; j++){
                if(j > i+1 && arr[j] == arr[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while (k < l) {
                    int sum = arr[i]+arr[j]+arr[k]+arr[l];
                    if(sum < 0){
                        k++;
                    }else if(sum>0){
                      l--;
                    }else{
                        ans.add(Arrays.asList(arr[i],arr[j],arr[k],arr[k]));
                        k++;
                        l--;

                        while (k < l && arr[k] == arr[k-1]) {
                            k++;
                        }
                        while (k < l && arr[l] == arr[l+1]) {
                            l--;
                        }
                       
                    }
                   
                }
            }
        }
        System.out.println(ans);
    }
}
