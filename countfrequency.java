import java.lang.*;
import java.util.Arrays;
class countfrequency{
    public static void main (String[] args){
        int[] arr={1,2,3,4,5,1,2,3,1,2,1,2};
        int len=arr.length;
        countfreq(arr, len);

    }
    public static void countfreq(int[] arr,int n){
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            int count=1;
            while(i<n-1 && arr[i]==arr[i+1]){
                i++;
                count++;
            }
            System.out.println(arr[i]+"->"+count);
            count++;
        }
    }

}