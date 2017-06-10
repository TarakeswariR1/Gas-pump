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
public class Returncash2A extends ReturncashA{
    public void ReturncashA(DataStore ds){
        float c=((DataStore2)ds).getCash1();
        System.out.println(c+"  is returned");
    }
}
