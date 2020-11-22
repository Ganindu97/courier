/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo_inheritance_s;
import com.sun.glass.events.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Savindu Nimsara
 */
public class Parent_Items {
    
    public double Quantity;
    public double Special_casing1;
    public double Special_casing2;
    
    public double Amount;
    public double Casing1;
    public double Casing2;
    
    public double itemcost1;
    public double itemcost2;
    public double itemcost;
    
    
    public double GetAmount(){
        itemcost1= Quantity*(Special_casing1+Special_casing2);
        itemcost2= Amount*(Casing1+Casing2);
        itemcost= itemcost1+itemcost2;
        return(itemcost);
        
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame= new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit","Inheritances",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
            
        
    }
    
    public double  mcTax = 5;
    public double  cFindTax(double cAmount){
        double FindTax = cAmount-(cAmount*mcTax);
        return FindTax;
        
        
    }
    
    public void NumbersOnly(java.awt.event.KeyEvent evt){
        
        char iNumber= evt.getKeyChar();
        if((!Character.isDigit(iNumber))
            ||(iNumber==KeyEvent.VK_BACKSPACE)
                    ||(iNumber==KeyEvent.VK_DELETE)){
            evt.consume();
        
    }
    }
    
    
}
