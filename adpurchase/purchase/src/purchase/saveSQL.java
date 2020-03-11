/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author QstnMrked
 */
public class saveSQL {
    
 static Connection connection;
    static String url;
    static Statement st;
    static ResultSet rs;
    static Connection conn=null;
   
    public void  sqlsavedb(int sqlchoice,String Code,int idName,String date,String content,int Quan, String net, int unitP,String amount) throws ClassNotFoundException
    {
     try{
    Class.forName("com.mysql.cj.jdbc.Driver"); 
    url="jdbc:mysql://localhost:3306/vqdbf"; 
         connection = DriverManager.getConnection(url, "root","");
         st = connection.createStatement();
         if(sqlchoice==0)
         {
         st.executeUpdate("INSERT INTO `vqdbf`.`suppliers_transaction` (`SUPCODE`,`OR`,`DATE`,`DCG`,`QUANTITY`,`NETW`,`UNIT_PRICE`,`AMOUNT`) VALUES ( ' "+ Code + "',' "+idName+"', '"+date+"', '"+content+"', '"+Quan+"', '"+net+"', '"+unitP+"', '"+amount+"');");
         }
         if(sqlchoice==1)
         {
         st.executeUpdate("INSERT INTO `vqdbf`.`buyer_transaction` (`BUYCODE`,`OR`,`DATE`,`DCG`,`QUANTITY`,`NETW`,`UNIT_PRICE`,`AMOUNT`) VALUES ( ' "+ Code + "',' "+idName+"', '"+date+"', '"+content+"', '"+Quan+"', '"+net+"', '"+unitP+"', '"+amount+"');");
         }
         
         JOptionPane.showMessageDialog(null, "Accoount Created","System Message",JOptionPane.INFORMATION_MESSAGE);
     } catch (SQLException ex) {
         Logger.getLogger(saveSQL.class.getName()).log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null, "Accoount  not Created","System Message",JOptionPane.INFORMATION_MESSAGE);
     }
               
    }
}
