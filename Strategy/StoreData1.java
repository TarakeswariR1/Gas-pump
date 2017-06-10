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
public class StoreData1 extends StoreData{
    @Override
    public void storeData(DataStore ds){
    float a=((DataStore1)ds).getTemp_a();
    float b=((DataStore1)ds).getTemp_b();
    ((DataStore1)ds).setRprice(a);
    ((DataStore1)ds).setSprice(b);
    }

   
    
}
