/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

/**
 *
 * @author Administrator
 */
public class Tablec {
    private int Tableno;
    private int Capacity;
    private String Status;
   private String Customer;
   
   public Tablec(int Tableno, int Capacity,String Customer,String Status){
       this.Tableno=Tableno;
       this.Capacity=Capacity;
       this.Status=Status;
       this.Customer=Customer;
       
   }
   int getTableno(){
       return Tableno;
       }   
   int getCapacity(){
       return Capacity;
       }   
   String getStatus(){
       return Status;
       }   
   String getCustomer(){
       return Customer;
       }   
   
}
