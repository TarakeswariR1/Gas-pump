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
public class Printreceipt1 extends Printreceipt{
    @Override
    public void Printreceipt(DataStore ds)
    {
    	System.out.println("Your Receipt option.");
    	float lit=((DataStore1)ds).getG();
    	System.out.println("Litres Pumped="+lit);
    	float l=((DataStore1)ds).getTotal();
    	System.out.println("You have paid= "+l);
    	System.out.println("Thank You");
    }
}
