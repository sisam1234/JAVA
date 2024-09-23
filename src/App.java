import java.net.*;


public class App {
    public static void main(String[] args) throws Exception {
        // InetAddress a = InetAddress.getByName("www.google.com");
        InetAddress a=  InetAddress.getLocalHost();
        System.out.println(a);
        // System.out.println(a.getHostName());
        // System.out.println(a.getHostAddress());
        // System.out.println(a.getCanonicalHostName());
    }
}
