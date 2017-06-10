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
public class SetInitialValues2 extends SetInitialValues {
  @Override
  public void SetInitialValues(DataStore ds){
	  ((DataStore2)ds).setL(0);
	  ((DataStore2)ds).setTotal(0);
    }   
}
