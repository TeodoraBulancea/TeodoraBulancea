/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazedate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell E5430 0
 */
public class TestBazeDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String user = "firstdb";
        String password = "firstdb"; //String url = "jdbc:derby://localhost:1527/seconddb;create=true";
        String url = "jdbc:derby:firstdb;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try
        {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            //statement.execute("CREATE TABLE FIRSTTABLE (ID INT PRIMARY KEY, NAME VARCHAR(12))");
            //statement.execute("INSERT INTO FIRSTTABLE VALUES (10,'TEN'),(20,'TWENTY'),(30,'THIRTY')");
            resultSet = statement.executeQuery("SELECT * FROM FIRSTTABLE");
 

    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(TestBazeDate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TestBazeDate.class.getName()).log(Level.SEVERE, null, ex);
        }
            String currentID = "";
            String currentName = "";
            System.out.println("ID NAME");
            System.out.println("==========");
        try {
            while(resultSet.next()){
                currentID = resultSet.getString(1);
                currentName = resultSet.getString(2);
                System.out.println(currentID + " " +currentName);
                
            }   } catch (SQLException ex) {
            Logger.getLogger(TestBazeDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
         
        
        
    

