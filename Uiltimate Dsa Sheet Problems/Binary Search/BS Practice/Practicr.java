
public class Practicr {
//search in rotated sorted 
public static void main(String[] args) {
    while (low <= high) {
        int mid = (low+high)/2;
        if(arr[mid] == x) return true;
        if(arr[low] <= arr[mid]){
            if(arr[low] <= x && x <= arr[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }else if(arr[mid] <= x && x <= arr[high]){
            low = mid+1;
        }else{
            high = mid-1;
        }
    }

    // for duplictes;
    while(low <= mid){
        int mid = (low+high)/2;
        if(arr[low] == arr[mid] && ar[mid] == arr[high]){
            low++;
            high--;
        continue;
        }
        if(arr[low] <= mid){
            if(arr[low] <= x && x<=arr[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }else if(arr[mid] <= x && x<=arr[high]){
            low = mid+1;
        }else{
            high = mid-1;
        }
    }

    //find minum in rotated sorted arr;
    while(low <= high){
        int mid = (low+high)/2;
        if(arr[low] <= arr[mid]){
            ans = Math.min(arr[low] , ans);
            low = mid+1;
        }else{
            ans = Math.min(arr[mid] , ans);
            high = mid-1;
        }
    }

    while(low <= high){
        int mid = low+high/2;
        if(fun(mid,n) == 1) {
            // ans = mid;
            return mid;
        }else if(fun(mid,n) == 0){
            low = mid+1;
        }else{
            high = mid-1;
        }
    }
}
static fun(int i,in n){
    int ans=1;
    for(int i=1 ; i<=n ; i++){
        ans = an*i;
        if(ans < m) return 2;
    }
    if(ans == m) return 1;
    return 0;
}
}


//capacity tp ship packages within  in d days;
int low = max , high = sum of arr;
int dasy = 5;
while(low <= high){
    int mid = low+high/2;
    int days = fun(arr,mid);
    if(days <= dasy){
        high = mid-1;
    }else{
        low = mid+1;
    }
    return low;
}
//capicty days
fun(arr,cap){
    int days = 1 , tot = 0;
    for(int i=0 ; i<n ; i++){
        if(arr[i]+tot > cap){
            days = days+1;
            tot = arr[i];
        }else{
            tot += arr[i];
        }
    }
    return days;
}