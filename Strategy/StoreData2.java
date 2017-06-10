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
public class StoreData2 extends StoreData{
    @Override
    public void storeData(DataStore ds){
        int a=((DataStore2)ds).getTemp_a1();
        
        int b=((DataStore2)ds).getTemp_b1();
        int c=((DataStore2)ds).getTemp_c1();
        ((DataStore2)ds).setRprice(a);
        ((DataStore2)ds).setPprice(b);
        ((DataStore2)ds).setSprice(c);
    }
}
