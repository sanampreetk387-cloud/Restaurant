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
       createTablesTable();
       createStaffTable();

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
public void createTablesTable() {
        
         try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS Tables("
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
}

