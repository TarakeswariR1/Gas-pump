/*

this is the interface for Abstract Factory for GasPump 1 and GasPump 2
 * 
 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract_factory;
import DataStore.*;
import Strategy.*;

/**
 *
 * @author tarak
 */
public interface Abstractfactory {
	public DataStore CreateDataStore();
	
    public Cancel_msg getCancel_msg();
    public Display_menu getDisplay_menu();
    public Gaspumpedmsg getGaspumpedmsg();
    public Pay_msg getPay_msg();
    public Printreceipt getPrintreceipt();
    public NoReceipt getNoReceipt();
    public Ready_msg getReady_msg();
    public Reject_msg getReject_msg();
    public SetInitialValues getSetInitialValues();
    public SetPrices getSetPrices();
    public Stopmsg getStopmsg();
    public StoreData getStoreData();
    public Storecash getStorecash();
    public Pumpgasunit getPumpgasunit();
    public ReturncashA getReturncashA();
    public ReturncashB getReturncashB();
    
}
