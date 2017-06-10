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
public class Gaspumpedmsg1 extends Gaspumpedmsg{
    public void Gaspumpedmsg(DataStore ds){
        float g=((DataStore1)ds).getG();
        System.out.println("The Gas pump has sucessfully pumped units:" +g);
    }
    
}
