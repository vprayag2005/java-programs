public class quicksort {
    int  partion(String[] arr, int lb,int ub){
        int start=lb;
        int end = ub;
        String pivot=arr[start];
        while (start<end) {
            while (start < end && arr[start].compareTo(pivot) <= 0) {
                start++;
            }
            while (arr[end].compareTo(pivot) > 0) {
                end--;
            }if (start<end) {
                String temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
            
        }
        arr[lb] = arr[end];
        arr[end] = pivot;
        return end;
    }
    void sort(String[] arr, int lb,int ub){
        if(lb<ub){
            int loc=partion(arr,lb,ub);
            sort(arr,lb,loc-1);
            sort(arr,loc+1,ub);
        }
    }
    public static void main(String[] args) {
        String[] arr ={"a","z","y","b","o","c"};
        quicksort q=new quicksort();
        q.sort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
