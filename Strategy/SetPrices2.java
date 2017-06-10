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
public class SetPrices2 extends SetPrices {
    @Override
    public void setPrice(int g,DataStore ds){
        /*int a=((DataStore2)ds).getRegular1();
        int b=((DataStore2)ds).getSuper1();
        int c=((DataStore2)ds).getPremium1();
            if(g==1)
            	((DataStore2)ds).setPrice(a);
            else if(g==2)
            	((DataStore2)ds).setPrice(b);
            else if(g==3)
            	((DataStore2)ds).setPrice(c);*/
    	int a=((DataStore2)ds).getRprice1();
    	//System.out.println("Rprice gotten="+a);
        int b=((DataStore2)ds).getSprice1();
        int c=((DataStore2)ds).getPprice();
            if(g==1)
            	((DataStore2)ds).setPrice(a);
            else if(g==2)
            	((DataStore2)ds).setPrice(b);
            else if(g==3)
            	((DataStore2)ds).setPrice(c);
    }
    
}
