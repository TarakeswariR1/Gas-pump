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
public class Stopmsg2 extends Stopmsg{
     @Override
    public void Stopmsg(DataStore ds){
        System.out.println("GasPump-2 stopped");
    }
}
