import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        try
        {
            File fileRef = new File("/Users/priyanka/filehandling/participants_attendance.txt");
            if(!fileRef.exists())
                fileRef.createNewFile();

            FileOutputStream outputStream = new FileOutputStream(fileRef,true);
            BufferedOutputStream outputStream1 = new BufferedOutputStream(outputStream);
            String data[][] = new String[2][2];
            data[0][0]= "Anuja \t";
            data[0][1]= "Leave \n";
            data[1][0]= "Priya \t";
            data[1][1]= "Present \n";
            for(String elements[] : data)
            {
                 for(String ele : elements)
                 {
                    // outputStream.write(ele.getBytes(StandardCharsets.UTF_8));
                    outputStream1.write(ele.getBytes(StandardCharsets.UTF_8));
                 }
                 outputStream1.flush();
            }



        }catch(IOException ex)
        {
            System.err.println(ex.getMessage());
        }
    }
}
