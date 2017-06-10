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
public class Display_menu2 extends Display_menu{
    public void Display_menu(DataStore ds){
    	System.out.println("Please Select the type of Gas from the menu below");
        System.out.println("Options are:");
        System.out.println("1. Regular (Press 5 for Regular Gas)");
        System.out.println("2. Super (Press 6 for Super Gas)");
        System.out.println("3. Premium (Press 7 for Premium Gas)");
        System.out.println();
    }
    
}
