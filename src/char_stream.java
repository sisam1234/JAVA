import java.io.*;

public class char_stream {
     public static void main(String[] args) throws IOException{
        FileReader in = new FileReader("input.txt");
        FileWriter out= new FileWriter("output.txt");
        int c;
        while ((c=in.read())!=-1) {
            out.write(c);
        }
        System.out.println("Content written successfully");
        in.close();
        out.close();
    }
}
