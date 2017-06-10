/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input;

import DataStore.DataStore;
import DataStore.DataStore2;
import MDAFSM.MDAFSM;

/**
 *
 * @author tarak
 */
public class GasPump2 {
    MDAFSM MDA_O=null;
    DataStore ds_o=null;
    public GasPump2(MDAFSM MDA_O, DataStore ds_o){
    	this.MDA_O=MDA_O;
    	this.ds_o=ds_o;
    } 
    
    public void Activate(int a, int b, int c){
        if((a>0) && (b>0) && (c>0)){
            ((DataStore2)ds_o).setTemp_a(a);
            //System.out.println("Temp a="+ ((DataStore2)ds_o).getTemp_a1());
            ((DataStore2)ds_o).setTemp_b(b);
            ((DataStore2)ds_o).setTemp_c(c);
            MDA_O.Activate();
        }
    }
    
    public void Start(){
        MDA_O.Start();
    }
    
    public void PayCash(int c){
        if(c>0){
        	((DataStore2)ds_o).setCash(c);
            //System.out.println(((DataStore2)ds_o).getCash1()+"GetCash"); //remove later
            MDA_O.PayType(2);
        }
    }
    
    public void Cancel(){
        MDA_O.Cancel();
    }
    
    public void Super(){
        MDA_O.SelectGas(2);
    }
    
    public void Premium(){
        MDA_O.SelectGas(3);
    }
    
    public void Regular(){
        MDA_O.SelectGas(1);
    }
    
    public void StartPump(){
        MDA_O.StartPump();
    }
    
    public void PumpLiter(){
        int cash=((DataStore2)ds_o).getCash1();
        //System.out.println("Cash"+ cash);
        int price=((DataStore2)ds_o).getPrice1();
        System.out.println("Price="+price);
        int L=((DataStore2)ds_o).getL1();
        if(cash < (L+1)*price){
            MDA_O.StopPump();
        }
            else{
            MDA_O.Pump();
        }
        
    }
    
    public void Stop(){
        MDA_O.StopPump();
    }
    
    public void Receipt(){
        MDA_O.Receipt();
    }
    
    public void NoReceipt(){
        MDA_O.NoReceipt();
    }
}
