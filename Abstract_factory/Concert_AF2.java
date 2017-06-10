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

/*Concrete Factory for GasPump-2*/
public class Concert_AF2 implements Abstractfactory{
    DataStore ds=new DataStore2();
    public DataStore CreateDataStore()
	{
		return(this.ds);
	}
    public DataStore GetDataStore()
	{
		return this.ds;
	}
    public  Cancel_msg getCancel_msg(){
        Cancel_msg can=new Cancel_msg2();
        return can;
    }
    
    public ReturncashA getReturncashA(){
        Returncash2A rta=new Returncash2A();
        return rta;
    }
  
    public ReturncashB getReturncashB(){
        ReturncashB2 rtb=new ReturncashB2();
        return rtb;
    }
    
    public  Display_menu getDisplay_menu(){
        Display_menu2 dis=new Display_menu2();
        return dis;
    }
    
    /*public Returncash2A getReturncash2A(){
        Returncash2A rta=new Returncash2A();
        return rta;
    }
    
    public ReturncashB2 getReturncashB2(){
        ReturncashB2 rtb=new ReturncashB2();
        return rtb;
    }*/
    
    public  Gaspumpedmsg getGaspumpedmsg(){
        Gaspumpedmsg2 gpm=new Gaspumpedmsg2();
        return gpm;
    }
    
    public NoReceipt getNoReceipt(){
        Noreceipt2 npt=new Noreceipt2();
        return npt;
    }
    
    public  Pay_msg getPay_msg(){
        Pay_msg pmg=new Pay_msg2();
        return pmg;
    }
    
    public  Printreceipt getPrintreceipt(){
        Printreceipt prt=new Printreceipt2();
        return prt;
    }
    
    public  Ready_msg getReady_msg(){
        Ready_msg2 rmg=new Ready_msg2();
        return rmg;    
    }
    
    public  Reject_msg getReject_msg(){
        Reject_msg2 rjm=new Reject_msg2();
        return rjm;
    }
    
    public  SetInitialValues getSetInitialValues(){
        SetInitialValues2 siv=new SetInitialValues2();
        return siv;
    }
    
    public  SetPrices getSetPrices(){
        SetPrices2 spc=new SetPrices2();
        return spc;
    }
    
    public  Stopmsg getStopmsg(){
        Stopmsg2 smg=new Stopmsg2();
        return smg;
    }
    
    public  StoreData getStoreData(){
        StoreData2 sdt=new StoreData2();
        return sdt;
    }
    
    public  Storecash getStorecash(){
        Storecash2 sch=new Storecash2();
        return sch;
    }
    
    public  Pumpgasunit getPumpgasunit()
    {
        Pumpgasunit2 pmu=new Pumpgasunit2();
        return pmu;
    }
}
