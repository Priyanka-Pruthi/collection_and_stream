import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInoutStreamEx {
    public static void main(String[] args) {
       // File fileRef = new File("/Users/priyanka/filehandling/participants.txt");
        try
        {
           // FileInputStream inputStream = new FileInputStream(fileRef);
            FileInputStream inputStream = new FileInputStream("/Users/priyanka/filehandling/participants.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            int data;
            while ((data = bufferedInputStream.read()) != -1)
            {
                System.out.print((char)data);
            }

        }catch(IOException ex)
        {
            System.err.println(ex.getMessage());
        }
    }
}
