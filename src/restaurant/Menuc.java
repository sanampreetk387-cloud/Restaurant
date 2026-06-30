/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

/**
 *
 * @author Administrator
 */
public class Menuc {
    private int Id;
    private String Item;
    private String Category;
    private float Price;
    private String Status;
    
  public Menuc(int Id,String Item ,String Category,float Price,String Status){
      this.Id=Id;
      this.Item=Item;
      this.Category=Category;
      this.Price=Price;
      this.Status=Status;
       }
  public int getId(){
      return Id;
  }
  public String getItem(){
      return Item;
  }
  public String getCategory(){
      return Category;
      }
  public float getPrice(){
      return Price;
  }
  public String getStatus(){
      return Status;
      
  }
}
