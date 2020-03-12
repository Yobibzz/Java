
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author QstnMrked
 */
public class saveRegister {
    
    static Connection connection;
    static String url;
    static Statement st;
    static ResultSet rs;
    static Connection conn=null;
    
    public void  saveSupplier(String code,String name,String add,String con,String tin)
    {
     try {
         Class.forName("com.mysql.jdbc.Driver");
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(saveRegister.class.getName()).log(Level.SEVERE, null, ex);
     }
            url="jdbc:mysql://localhost:3306/vsql?serverTimezone=UTC";
     try {
         connection = DriverManager.getConnection(url, "root","");
     } catch (SQLException ex) {
         Logger.getLogger(saveRegister.class.getName()).log(Level.SEVERE, null, ex);
     }
     try {
         st = connection.createStatement();
     } catch (SQLException ex) {
         Logger.getLogger(saveRegister.class.getName()).log(Level.SEVERE, null, ex);
     }
            
     try {
         st.executeUpdate("INSERT INTO `vsql`.`suppliers_table` (`SUPCODE`, `SUPNAME`, `SUPADDRESS`, `SUPPCONTACT`,`SUPPTIN`) VALUES ( '"+code+"',' "+ name + "',' "+add+"', '"+con+"',  '"+tin+"');");
     } catch (SQLException ex) {
         Logger.getLogger(saveRegister.class.getName()).log(Level.SEVERE, null, ex);
     }
               JOptionPane.showMessageDialog(null, "Register Successful","System Message",JOptionPane.INFORMATION_MESSAGE);
    }
    public void  saveBuyer(String bcode,String bname,String badd,String bcon,String btin)
    {
     try {
         Class.forName("com.mysql.jdbc.Driver");
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(saveRegister.class.getName()).log(Level.SEVERE, null, ex);
     }
            url="jdbc:mysql://localhost:3306/vsql?serverTimezone=UTC";
     try {
         connection = DriverManager.getConnection(url, "root","");
     } catch (SQLException ex) {
         Logger.getLogger(saveRegister.class.getName()).log(Level.SEVERE, null, ex);
     }
     try {
         st = connection.createStatement();
     } catch (SQLException ex) {
         Logger.getLogger(saveRegister.class.getName()).log(Level.SEVERE, null, ex);
     }
            
     try {
         st.executeUpdate("INSERT INTO `vsql`.`buyer_table` (`BUYCODE`, `BUYNAME`, `BUYADDRESS`, `BUYCONTACT`,`BUYTIN`) VALUES ( '"+bcode+"',' "+ bname + "',' "+badd+"', '"+bcon+"',  '"+btin+"');");
     } catch (SQLException ex) {
         Logger.getLogger(saveRegister.class.getName()).log(Level.SEVERE, null, ex);
     }
               JOptionPane.showMessageDialog(null, "Register Successful","System Message",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void  saveProduct(String dcg,String pname,String unit)
    {
     try {
         Class.forName("com.mysql.jdbc.Driver");
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(saveRegister.class.getName()).log(Level.SEVERE, null, ex);
     }
            url="jdbc:mysql://localhost:3306/vsql?serverTimezone=UTC";
     try {
         connection = DriverManager.getConnection(url, "root","");
     } catch (SQLException ex) {
         Logger.getLogger(saveRegister.class.getName()).log(Level.SEVERE, null, ex);
     }
     try {
         st = connection.createStatement();
     } catch (SQLException ex) {
         Logger.getLogger(saveRegister.class.getName()).log(Level.SEVERE, null, ex);
     }
            
     try {
         st.executeUpdate("INSERT INTO `vsql`.`product_table` (`DCG`, `PRODUCT_NAME`, `UNIT_PRICE`) VALUES ( ' "+ dcg + "',' "+pname+"', '"+unit+"');");
     } catch (SQLException ex) {
         Logger.getLogger(saveRegister.class.getName()).log(Level.SEVERE, null, ex);
     }
               JOptionPane.showMessageDialog(null, "Register Successful","System Message",JOptionPane.INFORMATION_MESSAGE);
    }
    
}

    

