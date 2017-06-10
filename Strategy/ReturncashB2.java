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
public class ReturncashB2 extends ReturncashB{
    @Override
    public void ReturncashB(DataStore ds){
    int c=((DataStore2)ds).getCash1();
    //System.out.println("Cash gotten=="+c);
    int t=((DataStore2)ds).getTotal1();
    int j=c-t;
    //System.out.println("rem bal"+j);
    ((DataStore2)ds).setBalance(j);
    
    }
}
