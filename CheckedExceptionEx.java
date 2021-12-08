import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class CheckedExceptionEx {
    public static void main(String[] args) {
        File fileRef = new File("/Users/priyanka/Examples/Employee.java");
        FileReader reader = null;
        try {
            reader = new FileReader(fileRef);
            String line =null;
            char data[] = new char[100];
            while (reader.read(data)!=-1)
            {
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            System.err.println("No File found on given address "+fileRef.getAbsolutePath());
//            e.printStackTrace();
        }catch (IOException ex)
        {
            ex.printStackTrace();
        }finally {
            System.out.println("Finally block");
            if(Objects.nonNull(reader)) {
                try {
                    reader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }
}
