import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
class write_to_file {
    public static void main(String [] args) {
        String data = "This is a File Program";
        try {
            OutputStream fos=new FileOutputStream("java.txt");
            fos.write(data.getBytes());
            System.out.println("Written to file");
            fos.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}