import java.sql.*;

public class jdbc {
    public static void main(String[] ar)
    {
        String url="jdbc:mysql://localhost:3306/database1";
        String username="root";
        String password="pass";
        try{
        // register the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");    
        // create the connection
        Connection con=DriverManager.getConnection(url, username, password);
        // create the statement
        Statement st=con.createStatement();
        //execute the query
        String query1="UPDATE STUDENT SET NAME='ALMAS' WHERE ID=69";
        st.executeQuery(query1);
        //fetching using ResultSet
        String query2="SELECT * FROM STUDENT WHERE NAME='ALMAS'";
        ResultSet rs=st.executeQuery(query2);
        while(rs.next())
        {
            int id=rs.getInt("enroll_no");
            String name=rs.getString("name");
            String dept=rs.getString("depot");
            System.out.println("ID: "+id+"NAME: "+name+"DEPT: "+dept);
        }
        rs.close();
        st.close();
        con.close();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }
}