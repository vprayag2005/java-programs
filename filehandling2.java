import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling2 {
       public static void main(String[] args) {
        //Using FILEREADER AND FILEWRITER
        FileReader in=null;
        FileWriter out=null;
        try{
            in=new FileReader("input.txt");
            out=new FileWriter("output.txt");
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
