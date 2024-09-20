import java.io.*;
public class bufferoutputstream {
    public static void main(String[] args)throws IOException{
        
            String str = "Hello World";
            FileOutputStream fos = new FileOutputStream("input.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            byte b[] =str.getBytes();
            bos.write(b);
            bos.flush();
            bos.close();
            System.out.println("content written successfully");

        
    }
}
