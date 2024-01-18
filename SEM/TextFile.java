import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TextFile {
    public static void main(String[] ar) throws IOException
    {
        String content="poda potta";
        FileReader fr=null;
        FileWriter fw=null;
        try
        {
            fr=new FileReader("C:\\Users\\green\\Desktop\\java programs\\files/input1.txt");
            int ch;
            System.out.println("contents of the file are below:");
            while((ch=fr.read())!=-1)
            {
                System.out.print((char)ch);
            }
            fw=new FileWriter("C:\\Users\\green\\Desktop\\java programs\\files/input1.txt");
            fw.write(content);
            System.out.println(" ***new contents of the file are below:");
            int c;
            while((c=fr.read())!=-1)
            {
                System.out.print((char)c);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(fr!=null)
            {
               fr.close();
            }
            if(fw!=null)
            {
                fw.close();
            }
        }
    }
    
}
