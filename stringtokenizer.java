import java.io.*;
import java.util.*;;
public class stringtokenizer {
    public static void main(String[] args) {
        int sum=0;
        try {
            BufferedReader  b =new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the line of integer"); 
            String str = b.readLine();
            StringTokenizer st = new StringTokenizer(str);
            while (st.hasMoreTokens()) {
                String token =st.nextToken();
                sum+=Integer.parseInt(token);
            }
        } catch (IOException e) {
            System.err.println(e);
        }finally{
            System.out.println(sum);
        }
    }
}
