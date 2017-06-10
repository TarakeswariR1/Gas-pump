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
public class Storecash2 extends Storecash{
    @Override
    public void storeCash(DataStore ds){
        float c=((DataStore2)ds).getCash1();
        ((DataStore2)ds).setCash(c);
    }
}
