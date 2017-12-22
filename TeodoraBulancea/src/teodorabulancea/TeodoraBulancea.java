/*
 * Insert of records in 2 databases
 */
package teodorabulancea;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Teodora
 */
public class TeodoraBulancea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            //first database details  
            String url1 = "jdbc:derby://localhost:1527/FIRSTDB";
            String user1 = "firstdb";
            String pass1 = "firstdb";
            
            //second database details
            String url2 = "jdbc:derby://localhost:1527/SECONDDB";
            String user2 = "seconddb";
            String pass2 = "seconddb";
            
            //creating a connection for each database
            Connection connection1 = DriverManager.getConnection(url1, user1, pass1);
            Connection connection2 = DriverManager.getConnection(url2, user2, pass2);
            
            //creating the statements
            Statement statement1 = connection1.createStatement();
            Statement statement2 = connection2.createStatement();
            
            //inserting the records into the tables
            String sql1 = "INSERT INTO FIRSTTABLE VALUES(10, 'TEN'), (20, 'TWENTY'), (30, 'THIRTY')";
            statement1.execute(sql1);
            System.out.println("Persoana adaugata in tabela FIRSTTABLE");
            
            
            String sql2 = "INSERT INTO SECONDTABLE VALUES(100, 'ONE HUNDRED'), (200, 'TWO HUNDRED'), (300, 'THREE HUNDRED')";
            statement2.execute(sql2);
            System.out.println("Persoana adaugata in tabela SECONDTABLE");
            
        }catch(SQLException ex){
            Logger.getLogger(TeodoraBulancea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
