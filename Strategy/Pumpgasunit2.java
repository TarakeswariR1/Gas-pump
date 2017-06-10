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
public class Pumpgasunit2 extends Pumpgasunit{
    public void Pumpgasunit(DataStore ds){
       int l=((DataStore2)ds).getL1();
       l=l+1;
       int total;
       int price = ((DataStore2)ds).getPrice1();
       //System.out.println("Gotten price"+price);
       total =price*l;
       
       ((DataStore2)ds).setL(l);
       ((DataStore2)ds).setTotal(total);
    }
    
}
