/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

/**
 *
 * @author Administrator
 */
public class Billingc {
    private int ID;
    private int Quantity;
    private int Subtotal;
    public Billingc(int ID,int Quantity,int Subtotal){
    this.ID=ID;
    this.Quantity=Quantity;
    this.Subtotal=Subtotal;
    }
    public int getID(){
      return ID;
  }
    public int getQuantity(){
      return Quantity;
  }
    public int getSubtotal(){
      return Subtotal;
  }
 }
