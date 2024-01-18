import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


public interface Add extends Remote
{
    public int add(int a,int b);
}

public class AddIm extends UnicastRemoteObject implements Add
{
    protected AddIm() throws RemoteException
    {
        super();
    }
    public int add(int a,int b)
    {
        return a+b;
    }
}

public class AdditionClient
{
    try
    {
        Add o1=(Add) Naming.lookup("rmi://localhost/adds");
        System.out.println("SUM="+o1.add(5, 11));

    }
}

public class AdditionServer
{
    try
    {
        AddIm obj=new AddIm();
        LocateRegistry.createRegistry(1099);
        Naming.bind("rmi://localhost/adds");
        System.out.println("SERVER IS RUNNING");
    }
}

import java.sql.*;

public class hello
{
    public static void main(String[] ar) 
    {
       String url="jdbc:mysql://localhost:3306/db1";
       String username="root";
       String password="pass";
       try{
            //register the JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection
            Connection con=DriverManager.getConnection(url, username, password);
            //statement create
            Statement st=con.createStatement();
            //query
            String query1="SELECT * FROM STUDENT WHERE NAME='ALMAS'";
            //ResultSet
            ResultSet rs=st.executeQuery(query1);
            while(rs.next())
            {
                int id=rs.getInt("enrollNo");
                String name=rs.getString("stuName");
                System.out.println("ID: "+id+"NAME: "+name);
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