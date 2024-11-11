import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        System.out.println("Enter the String:-");
        Scanner sc = new Scanner(System.in);
        String val=sc.nextLine();
        int i=0,j=val.length()-1,flag=0;
        while (i<j) {
            if (val.charAt(i)!=val.charAt(j)) {
                System.err.println("Not Plaindrome");
                flag=1;
                break;
            }
            i++;
            j--;
        }
        if(flag==0) {
            System.err.println("Palindrome");
        }

    }
}