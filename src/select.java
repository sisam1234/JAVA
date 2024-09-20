import java.sql.*;
public class select {
    public static void main(String[] args) throws Exception {
        try{
            Class.forName("com.mysql.jdbc.Driver") ;
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/severdb? useSSL=false", "root", "root");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select * from tblstudent");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
            }   
            con.close();        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
