public class Mincount {
        public static void main(String[] args){
            int[] arr={2,2,2,2,3,4,5,4,3,4,3,4,1,1};
            int size=arr.length;
            System.out.print("Most frequent max element is:"+counfre(arr,size));
        }
        public static int counfre(int[] arr,int size){
            int minfreq=-1;
            int max_count=0;
            int mincount=Integer.MAX_VALUE;
            for(int i=0;i<size;i++){
                int count=0;
                while(i<size-1 && arr[i]==arr[i+1]){
                    i++;
                    count++;
                }
                if(count>0 && count<mincount){
                    mincount=count;
                    minfreq=arr[i];
                }
            }
            return minfreq;
        }
    }
