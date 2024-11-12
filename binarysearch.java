import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        int limit,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:-");
        limit=sc.nextInt();
        int [] arr=new int[limit];
        for (int i = 0; i < limit; i++) {
            arr[i]=sc.nextInt();
        }
        int start=0,end=arr.length-1,element;
        System.out.println("Enter the element to search");
        element=sc.nextInt();
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==element){
                System.out.println("element found at index "+ mid);
                flag=1;
                break;
            }else if(element > arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if (flag==0) {
            System.out.println("Not found");
        }
        sc.close();
    }
}
