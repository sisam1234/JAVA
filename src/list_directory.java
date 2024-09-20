import java.io.*;
public class list_directory {
    public static void main(String[]args){
        String dirpath = "C:\\Users\\Lenovo\\Desktop\\6th sem";
        File dir = new File(dirpath);
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
