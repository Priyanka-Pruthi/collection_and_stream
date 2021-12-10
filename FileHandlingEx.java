import java.io.File;
import java.io.IOException;

/*
Stream
  1. Stream is sequence of data
      we can read and write data
      we can read and right objects also
      only a representation of input and output
      stream can be source or destination
      writting data into stream is called output stream
      when we are reading data is called input stream
      example of input stream , writing from keyboard , reading any file
      input and output both stream can hold single character at a time
      transfering a data into stream or read data from te stream , it is
      equipped with buffer in memory.
      so this buffer memory is called buffer stream.

      2 stream
        Byte Stream
        Character Stream
 */
public class FileHandlingEx {
    public static void main(String[] args) throws IOException {
//        File fileRef = new File("/Users/priyanka/Examples/Employee234.java");
//        System.out.println("is file present on given path : "+fileRef.exists());
//        System.out.println("is given path represent a file : "+fileRef.isFile());
//        System.out.println("Absolute Path Given : "+fileRef.getAbsolutePath());
//        System.out.println("Path : "+fileRef.getPath());
//        System.out.println("Canonial Path : "+fileRef.getCanonicalPath());
//        System.out.println("Can we read the file :"+fileRef.canRead());
//        System.out.println("Can we write in file :"+fileRef.canWrite());
//        System.out.println("File Name : "+fileRef.getName());
//        System.out.println("Parent Directory : "+fileRef.getParent());

         // to create new file if it is not present already.
        File fileRef = new File("/Users/priyanka/filehandling");
        if(fileRef.exists())
        {
            System.out.println("File is present already");
            System.out.println(fileRef.getTotalSpace());
            System.out.println(fileRef.getFreeSpace());
            System.out.println(fileRef.getUsableSpace());
        }else
        {
            fileRef.createNewFile();
        }


    }
}
/* write a program to list all the available files from the directory.
    a the given path represents the directory ,if not raise proper message
    b use listFile method to get all the files
    c. iterate over file ref array and print the info
   write a program to list all the files whose extenstion is java  from the directory.

 */
