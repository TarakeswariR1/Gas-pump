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
public class Pumpgasunit1 extends Pumpgasunit {
    public void Pumpgasunit(DataStore ds){
      float g=((DataStore1)ds).getG();
       g=g+1;
       float total;
       float price = ((DataStore1)ds).getPrice();
       total =price *g;
       ((DataStore1)ds).setG(g);
       ((DataStore1)ds).setTotal(total);   
    }
    
}
