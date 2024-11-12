import java.util.*;
class AgeOverException extends Exception{
    AgeOverException(){
        System.out.println("Invalid Age");
    } 
}
public class exceptionhandling2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter your Age");
        num=sc.nextInt();
        try {
            if (num>18) {
                System.out.println("Valid Age");
            }else {
                throw new AgeOverException();
            }
        } catch (AgeOverException e) {
            System.out.println(e);
        }finally{
            sc.close();
        }
    }
}
