/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;
import DataStore.*;
/**
 *
 * @author tarak
 */
public class Printreceipt2 extends Printreceipt {
    public void Printreceipt(DataStore ds){
    	System.out.println("You have chosen Receipt option.");
    	int lit=((DataStore2)ds).getL1();
    	System.out.println("Litres Pumped="+lit);
    	int l=((DataStore2)ds).getTotal1();
    	System.out.println("Total Paid="+l);
    	//System.out.println("You have paid= "+l);
    	int bal=((DataStore2)ds).getBalance1();
    	System.out.println("Cash Returned="+bal);
    	System.out.println("Thank You");
    }
    
}
