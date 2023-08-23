public class Maxcount {
    public static void main(String[] args){
        int[] arr={1,2,3,2,1,2,3,4,2,2,1,4,4,4,4,4};
        int size=arr.length;
        System.out.print("Most frequent max element is:"+counfre(arr,size));
    }
    public static int counfre(int[] arr,int size){
        int max_count=0;
        int maxfreq=0;
        for(int i=0;i<size;i++){
            int count=1;
            while(i<size-1 && arr[i]==arr[i+1]){
                i++;
                count++;
            }
            if(count>max_count){
                max_count=count;
                maxfreq=arr[i];
            }
        }
        return maxfreq;
    }
}
