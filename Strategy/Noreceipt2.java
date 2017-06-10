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
public class Noreceipt2 extends NoReceipt {
    public void NoReceipt(DataStore ds){
    	System.out.println("You have chosen No Receipt option.");
    	int l=((DataStore2)ds).getTotal1();
    	System.out.println("You have paid= "+l);
    	int bal=((DataStore2)ds).getBalance1();
    	System.out.println("Please Collect Cash Returned="+bal);
    	System.out.println("Thank You");
    }
    
}
