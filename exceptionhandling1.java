import java.util.Scanner;
public class exceptionhandling1 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the FirstNumber");
        num1=sc.nextInt();
        System.out.println("Enter the FirstNumber");
        num2=sc.nextInt();
        try{
            int result= num1/num2;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println(e);
        }finally{
            sc.close();
        }
    }
}
