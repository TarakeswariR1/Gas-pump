/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Output;
import DataStore.*;
import Abstract_factory.*;
import Strategy.*;

/**
 *
 * @author tarak
 */
public class Output {
    Abstractfactory af=null;
    DataStore ds=null;
    public Output(Abstractfactory af, DataStore ds){
    	this.af=af;
    	this.ds=ds;
    }
    
    
    
    public void StoreData(){
    	System.out.println("Action StoreData");
    	StoreData object=af.getStoreData();
    	object.storeData(ds);
    }
    
    public void Cancel_msg()
	    {
    		System.out.println("Action CancelMsg");
	    	Cancel_msg object;
	    	object=af.getCancel_msg();
	    	object.Cancel_msg(ds);
	    }
    public void displayMenu()
	    {
    		System.out.println("Action DisplayMenu");
	    	Display_menu object;
	    	object=af.getDisplay_menu();
	    	object.Display_menu(ds);
	    }
    public void gasPumpedMsg()
	    {
    	System.out.println("Action PumpedMsg");
	    	Gaspumpedmsg object;
	    	object=af.getGaspumpedmsg();
	    	object.Gaspumpedmsg(ds);
	    }
     public void PayMsg() 
	    {
	    	Pay_msg object;
	    	object=af.getPay_msg();
	    	object.Pay_msg(ds);
	    }
     public void printReceipt()
	    {
	    	Printreceipt object;
	    	object=af.getPrintreceipt();
	    	object.Printreceipt(ds);
	     } 
     public void ReadyMsg()
	    {
	    	Ready_msg object;
	    	object=af.getReady_msg();
	    	object.Ready_msg(ds);
	    }
     public void rejectMsg()
	    {
	    	Reject_msg object;
	    	object=af.getReject_msg();
	    	object.Reject_msg(ds);
	    }
     public void setInitialValues()
	    {

	    	SetInitialValues object;
	    	object=af.getSetInitialValues();
	    	object.SetInitialValues(ds);
	    }
     public void stopMsg()
	    {
	    	Stopmsg object;
	    	object=af.getStopmsg();
	    	object.Stopmsg(ds);
	    }
	    
    public void setPrice(int g)
	    {
	    	SetPrices object;
	    	object=af.getSetPrices();
	    	object.setPrice(g,ds);
	    }
    public void storeCash()
	    {
	    	Storecash object;
	    	object=af.getStorecash();
	    	object.storeCash(ds);
	        
	    }
    
    public void PumpGasUnit()
	    {
	    	    Pumpgasunit object;
		    	object=af.getPumpgasunit();
		    	object.Pumpgasunit(ds);
	    }
    
    public void NoReceipt()
	    {

	    	NoReceipt object;
	    	object=af.getNoReceipt();
	    	object.NoReceipt(ds);
	    }
     public void ReturncashA()
	    {

	    	ReturncashA object;
	    	object=af.getReturncashA();
	    	object.ReturncashA(ds);
	    }
      public void ReturncashB()
	    {

	    	ReturncashB object;
	    	object=af.getReturncashB();
	    	object.ReturncashB(ds);
	    }
}
