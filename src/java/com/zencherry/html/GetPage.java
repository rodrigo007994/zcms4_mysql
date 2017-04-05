package com.zencherry.html;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetPage {

	public static String getContent(String label, String configUrl, String configUser, String configPass){
		String content=null;
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		conn=null;
        stmt=null;
        rs=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://"+configUrl, configUser, configPass);   
            stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT content FROM zcms WHERE label='"+label+"';");
			if (rs.next())
			{
				content=rs.getString("content");
			}
			rs.close();

			return content;
        }catch(ClassNotFoundException e1){
            System.out.println( e1.getClass().getName()+": "+ e1.getMessage() );
            return null;
        }catch(SQLException e2){
            System.out.println( e2.getClass().getName()+": "+ e2.getMessage() );
            return null;
        }
}
	
}
