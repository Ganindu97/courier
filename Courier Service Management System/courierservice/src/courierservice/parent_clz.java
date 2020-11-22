/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courierservice;
import com.sun.glass.events.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Savindu Nimsara
 */
public class parent_clz {
    
    
    public String sender_name;
    public double sender_address;
    public int telephone_no;
    public String reciever_name;
    public double reciever_address;
    public int reciever_tp;
    public double deliver_id;
    public double weight;
    public double shipping_m;
    public double item_cost;
    public double item_cost1;
    public double item_cost2;
    
     
    public double GetAmount(){
         
         item_cost1= weight+shipping_m;
         item_cost = item_cost1;
         
         return item_cost;
     }
      private JFrame frame;
    
    public void iExitSystem(){
        
        frame= new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit","Inheritances",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
}
