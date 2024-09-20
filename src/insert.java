
import java.sql.*;



public class insert {
    public static void main(String[] args){
    try{
            Class.forName("com.mysql.jdbc.Driver") ;
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/severdb? useSSL=false", "root", "root");
            String sql = "insert into tblstudent(Id,Name,Address) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 6);
            ps.setString(2, "Gita");
            ps.setString(3, "KTM");
            ps.executeUpdate();
            con.close();
            System.out.println("Data inserted");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
