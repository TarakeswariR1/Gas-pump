/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input;


import DataStore.DataStore;
import DataStore.DataStore1;
import MDAFSM.MDAFSM;

/**
 *
 * @author tarak
 */
public class GasPump1 {
    //Abstract_factory AF_O;
    MDAFSM MDA_O=null;
    DataStore ds_o=null;
    public GasPump1(MDAFSM MDA_O, DataStore ds_o){
    	this.MDA_O=MDA_O;
    	this.ds_o=ds_o;
    }
    /*public void setMDA(MDAFSM x){
        MDA_O=x;
    }
    
    public void setdata(DataStore x){
        ds_o=x;
    }
    
    public void setfactory(Abstract_factory x){
        AF_O=x;
    }*/
    
    public void Activate(float a, float b){
        if((a>0) && (b>0)){
            ((DataStore1)ds_o).setTemp_a(a);
            //System.out.println("Temp a="+ ((DataStore1)ds_o).getTemp_a());
            ((DataStore1)ds_o).setTemp_b(b);
            MDA_O.Activate();
        }
    }
    
    public void Start()
	{
		MDA_O.Start();
          
	}
	public void PayCredit()
	{
		MDA_O.PayType(1);
	}
	public void Reject()
	{
		MDA_O.Reject();
	}
	public void Cancel()
	{
		MDA_O.Cancel();
	}
        
        public void Approved(){
            MDA_O.Approved();
        }
        
        public void Super(){
            MDA_O.SelectGas(2);
        }
        
        public void Regular(){
            MDA_O.SelectGas(1);
        }
        
        public void StartPump(){
            MDA_O.StartPump();
        }
        
        public void PumpGallon(){
            MDA_O.Pump();
        }
        
        public void StopPump(){
            MDA_O.StopPump();
            MDA_O.Receipt();
        }
}
