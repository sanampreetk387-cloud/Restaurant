/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

/**
 *
 * @author Administrator
 */
public class Staffc {
    private int ID;
    private String Name;
    private int Phone;
    private String Role;
    private int Salary;

    public Staffc(int ID, String Name, int Phone,String Role,int Salary) {
        this.ID= ID;
        this.Name = Name;
        this.Phone = Phone;
        this.Role=Role;
        this.Salary=Salary;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

public int getPhone() {
        return Phone;
       
    }
    public String getRole(){
        return Role;
    }
    public int getSalary() {
        return Salary;
       
    }
}
