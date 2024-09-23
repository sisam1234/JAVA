import java.net.*;  
import java.io.*;   
public class url_connnection {
    public static void main(String[] args) throws Exception {
      
        try{    
            URL url=new URL("http://www.samriddhicollege.com/jbsccsit-college-in-bhaktapur-nepal");    
            URLConnection urlcon=url.openConnection();    
            InputStream stream=urlcon.getInputStream();    
            int i;    
            while((i=stream.read())!=-1){    
            System.out.print((char)i);    
            }    
            }catch(Exception e){System.out.println(e);}    
            
    }
}