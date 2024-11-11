import java.util.Scanner;
public class frequencyofchar {
    public static void main(String[] args) {
        String val;
        char freq_char;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        val=sc.nextLine();
        System.out.println("Enter the Chracter to count:-");
        freq_char=sc.nextLine().charAt(0);
        for (int i = 0; i <val.length()-1; i++) {
            if (val.charAt(i)==freq_char) {
                count++;
            }
        }
        System.out.println("Count ="+count);
    }
}