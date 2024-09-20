import java.util.*;
import java.io.*;
public class vowelandconst {
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        FileWriter vowel = new FileWriter("vowel.txt");
        FileWriter conso = new FileWriter("const.txt");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
                vowel.write(c);                
            }
            else{
                conso.write(c);
            }
        }
        vowel.close();
        conso.close();
    }
}
