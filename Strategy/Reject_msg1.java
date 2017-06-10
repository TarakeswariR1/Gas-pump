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
public class Reject_msg1 extends Reject_msg {
    public void Reject_msg(DataStore ds){
        System.out.println("Card Rejected.");
        System.out.println("Press Start (2) to start again");
    }
}
