/*
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

/*Concrete Factory for GasPump-1*/
public class Concert_AF1 implements Abstractfactory{
    
    DataStore ds=new DataStore1();
    
    public DataStore CreateDataStore()
	{
		return(this.ds);
	}
    public DataStore GetDataStore()
	{
		return this.ds;
	}
    public  Cancel_msg getCancel_msg(){
        Cancel_msg can=new Cancel_msg1();
        return can;
    }
    
    public ReturncashA getReturncashA(){
        Returncash1A rta=new Returncash1A();
        return rta;
    }
    
    public ReturncashB getReturncashB(){
        ReturncashB1 rtb=new ReturncashB1();
        return rtb;
    }
    
    public  Display_menu getDisplay_menu(){
        Display_menu1 dis=new Display_menu1();
        return dis;
    }
 
    public  Gaspumpedmsg getGaspumpedmsg(){
        Gaspumpedmsg gpm=new Gaspumpedmsg1();
        return gpm;
    }
    
    public  Pay_msg getPay_msg(){
        Pay_msg pmg=new Pay_msg1();
        return pmg;
    }
    
    public  Printreceipt getPrintreceipt(){
        Printreceipt prt=new Printreceipt1();
        return prt;
    }
 
    public  Ready_msg getReady_msg(){
        Ready_msg1 rmg=new Ready_msg1();
        return rmg;    
    }
    
    public NoReceipt getNoReceipt(){
        NoReceipt1 npt=new NoReceipt1();
        return npt;
    }
    
    public  Reject_msg getReject_msg(){
        Reject_msg1 rjm=new Reject_msg1();
        return rjm;
    }
    
    public  SetInitialValues getSetInitialValues(){
        SetInitialValues siv=new SetInitialValues1();
        return siv;
    }
    
    public  SetPrices getSetPrices(){
        SetPrices spc=new SetPrices1();
        return spc;
    }
    
    public  Stopmsg getStopmsg(){
        Stopmsg smg=new Stopmsg1();
        return smg;
    }
    
    public  StoreData getStoreData(){
        StoreData sdt=new StoreData1();
        return sdt;
    }
    
    public  Storecash getStorecash(){
        Storecash sch=new Storecash1();
        return sch;
    }
    
    public  Pumpgasunit getPumpgasunit()
    {
        Pumpgasunit pmu=new Pumpgasunit1();
        return pmu;
    }
    
    
    
}
