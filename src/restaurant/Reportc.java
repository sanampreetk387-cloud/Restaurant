/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

/**
 *
 * @author Administrator
 */
public class Reportc {
     private int BillID;
    private int OrderID;
    private float Subtotal;
    private float GST;
    private float Discount;
    private float Final;
    private String Status;
    public Reportc(int BillID, int OrderID,float Subtotal,float GST,float Discount,float Final,String Status) {
        this.BillID= BillID;
        this.OrderID= OrderID;
        this.Subtotal = Subtotal;
        this.GST=GST;
        this.Discount=Discount;
        this.Final=Final;
        this.Status=Status;
    }
     public int getBILLID() {
        return BillID;
    }
      public int getOrderID() {
        return OrderID;
    }
       public float getSubtotal() {
        return Subtotal;
    }
        public float getGST() {
        return GST;
    }
         public float getDiscount() {
        return Discount;
    }
          public float getFinal() {
        return Final;
    }
          public String getStatus(){
              return Status;
          }
}
