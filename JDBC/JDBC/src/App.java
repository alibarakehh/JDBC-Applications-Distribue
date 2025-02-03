import java.sql.*;

public class App {

    public static void main(String[] args) throws Exception {
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection cx = DriverManager.getConnection(
            "jdbc:sqlserver://Ali-Pc\\MSSQLSERVER02;databaseName=HR;integratedSecurity=true;trustServerCertificate=true");
        Statement st = cx.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM dbo.Employee");
        while (rs.next()) {
            String nom = rs.getString("Employee_name");
            int id = rs.getInt("Dept_ID");
            System.out.println( nom + " department id " + id);
        }
        rs.close();
        st.close();
        cx.close();
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
}
