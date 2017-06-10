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
public class SetInitialValues1 extends SetInitialValues{
    @Override
    public void SetInitialValues(DataStore ds){
        ((DataStore1)ds).setG(0);
        ((DataStore1)ds).setTotal(0);
    }
    
}
