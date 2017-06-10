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
public class Gaspumpedmsg2 extends Gaspumpedmsg{
    public void Gaspumpedmsg(DataStore ds){
        float l=((DataStore2)ds).getL1();
        System.out.println("The gas pump has sucessfully pumped l units: " +l);
    }
    
}
