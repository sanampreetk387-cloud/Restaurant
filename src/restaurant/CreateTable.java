/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class CreateTable {
    public CreateTable() {

        createMenuTable();
       createJStableTable();
       createStaffTable();
        createBillingTable();
        createOrdersTable();

    }
    
    public final void createMenuTable() {
        
         try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS Menu("
                    + "Id INTEGER PRIMARY KEY AUTOINCREMENT,"
                      + "Item TEXT,"
                    + "Category TEXT,"
                    +"Price INTEGER,"
                    +"Status TEXT"
                    + ")";

            st.executeUpdate(sql);

            System.out.println("Table Created Successfully");

            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

public void createStaffTable() {
        
         try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS Staff("
                    + "Id INTEGER PRIMARY KEY AUTOINCREMENT,"
                     
                    + "Name TEXT,"
                    + "Phone DOUBLE,"
                    +"Role TEXT,"
                    +"Salary DOUBLE"
                    + ")";

            st.executeUpdate(sql);

            System.out.println("Table Created Successfully");

            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        
}
public void createJStableTable() {
        
         try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS JStable("
                    + "Id INTEGER PRIMARY KEY AUTOINCREMENT,"
                     
                    + "Tableno INTEGER,"
                    + "Capacity INTEGER,"
                    +"Customer TEXT,"
                    +"Status TEXT"
                    + ")";

            st.executeUpdate(sql);

            System.out.println("Table Created Successfully");

            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
public void createBillingTable(){
    try{
         Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();
            String sql="CREATE TABLE IF NOT EXISTS Billing("
                +"ID INTEGER PRIMARY KEY AUTOINCREMENT,"
                    +"Quantity INTEGER,"
                    +"Price INTEGER,"
                    +"Total INTEGER"
                   
                    
                    
                    +")";
        st.executeUpdate(sql);

            System.out.println("Table Created Successfully");

            st.close();
            con.close();

    
    }
 catch(Exception e){
    System.out.println(e);
}
}
public void createOrdersTable(){
    try{
         Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();
            String sql="CREATE TABLE IF NOT EXISTS Orders("
                +"ID INTEGER PRIMARY KEY AUTOINCREMENT,"
                    +"Tableno INTEGER,"
                    +"Item INTEGER"
                    
                   +")";
        st.executeUpdate(sql);

            System.out.println("Table Created Successfully");

            st.close();
            con.close();

    
    }
 catch(Exception e){
    System.out.println(e);
 }
}
}

