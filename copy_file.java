import java.io.*;
class copy_file{
    public static void main(String[] args) {
        char[] array = new char[25];
        try {
            Reader input = new FileReader("java.txt");
            Writer output = new FileWriter("output.txt");
            input.read(array);
            output.write(array);
            System.out.println("File contents copied");
            input.close();
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
