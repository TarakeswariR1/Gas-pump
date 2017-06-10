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
public class SetPrices1 extends SetPrices {
    @Override
    public void setPrice(int g, DataStore ds){
        /*float a=((DataStore1)ds).getRegular();
        float b=((DataStore1)ds).getSuper();
            if(g==1)
            	((DataStore1)ds).setPrice(a);
            else if(g==2)
            	((DataStore1)ds).setPrice(b);*/
    	float a=((DataStore1)ds).getRprice();
        float b=((DataStore1)ds).getSprice();
            if(g==1)
            	((DataStore1)ds).setPrice(a);
            else if(g==2)
            	((DataStore1)ds).setPrice(b);
    }
}
