import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class filehandling1 {
    public static void main(String[] args) {
        //Using FILEINPUTSTREAM AND FILEOUTPUTSTREAM
        FileInputStream in=null;
        FileOutputStream out=null;
        try{
            in=new FileInputStream("input.txt");
            out=new FileOutputStream("output.txt");
            int i;
            while ((i=in.read())!=-1) {
                out.write(i);
            }
        }catch(IOException e){
            System.out.println(e);
        }finally{
            try{
                if (in!=null) {
                    in.close();
                }if (out!=null) {
                    out.close();
                }
            }catch(IOException e){
                System.out.print(e);
            }
        }
    }
}
