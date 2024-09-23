import java.net.*;
import java.io.*;
public class server {
    public static void main(String[] args)throws Exception {
        ServerSocket ss =new ServerSocket(4999);
        Socket s = ss.accept();
        System.out.println("Clinet Connection");
        InputStreamReader in =new InputStreamReader(s.getInputStream());
        BufferedReader bf  = new BufferedReader(in);
        String str = bf.readLine();
        System.out.println("Cllient:"+str);
        s.close();
        ss.close();
    }   
}
