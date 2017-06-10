/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;
import Abstract_factory.*;
import Input.*;
import MDAFSM.*;
import Output.*;
import java.io.*;
/**
 *
 * @author tarak
 */
public class Driver {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int input=0;
		float a,b;
		int a1,b1,c,cash;
    	int choice = 1;
    	System.out.println("Select Account" );
    	System.out.println("1. GasPump-1" );
    	System.out.println("2. GasPump-2" );
    	System.out.println("Enter your choice" );
    	input=Integer.parseInt(br.readLine());
    	if(input==1){
    		Concert_AF1 factory=new Concert_AF1();
    		Output op=new Output(factory, factory.GetDataStore());
    		MDAFSM mdaefsm=new MDAFSM(factory,op);
    		GasPump1 gp1=new GasPump1(mdaefsm, factory.GetDataStore());
    		System.out.println("GasPump-1 ");
    		System.out.println("Menu of Operations");
    		System.out.println("1. Activate (float a, float b)");
    		System.out.println("2. Start");
    		System.out.println("3. PayCredit");
    		System.out.println("4. Reject");
    		System.out.println("5. Approved");
    		System.out.println("6. Cancel");
    		System.out.println("7. Regular");
    		System.out.println("8. Super");
    		System.out.println("9. StartPump");
    		System.out.println("10. PumpGallon");
    		System.out.println("11. StopPump");
    		System.out.println("12. Quit");
    		System.out.println("Enter your choice");
    		while(true){
    			System.out.println("Select Operation");
    			input = Integer.parseInt(br.readLine());
                if(input==0)
                    continue;
                    if(input==12)
	            	break;
                    choice = input;
	            switch(choice)
	            {
                        case 1:   //activate
                            System.out.println("Operation:  Activate(float a, float b)");
                            System.out.println("Enter price for Regular");
                            a =Float.parseFloat(br.readLine());
                            System.out.println("Enter price for Super");
                            b =Float.parseFloat(br.readLine());
                            gp1.Activate(a, b);
                            System.out.println();
                        	System.out.println();
                        	System.out.println();
                            System.out.println("GasPump-1 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (float a, float b)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCredit");
                    		System.out.println("4. Reject");
                    		System.out.println("5. Approved");
                    		System.out.println("6. Cancel");
                    		System.out.println("7. Regular");
                    		System.out.println("8. Super");
                    		System.out.println("9. StartPump");
                    		System.out.println("10. PumpGallon");
                    		System.out.println("11. StopPump");
                    		System.out.println("12. Quit");
                    		System.out.println("Enter your choice");
                            break;
                        case 2:  //start
                        	System.out.println("Operation:  Start()");
                        	gp1.Start();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println("GasPump-1 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (float a, float b)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCredit");
                    		System.out.println("4. Reject");
                    		System.out.println("5. Approved");
                    		System.out.println("6. Cancel");
                    		System.out.println("7. Regular");
                    		System.out.println("8. Super");
                    		System.out.println("9. StartPump");
                    		System.out.println("10. PumpGallon");
                    		System.out.println("11. StopPump");
                    		System.out.println("12. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 3: //pay credit
                        	System.out.println("Operation:  PayCredit()");
                        	gp1.PayCredit();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println("GasPump-1 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (float a, float b)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCredit");
                    		System.out.println("4. Reject");
                    		System.out.println("5. Approved");
                    		System.out.println("6. Cancel");
                    		System.out.println("7. Regular");
                    		System.out.println("8. Super");
                    		System.out.println("9. StartPump");
                    		System.out.println("10. PumpGallon");
                    		System.out.println("11. StopPump");
                    		System.out.println("12. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 4: //reject
                        	System.out.println("Operation:  Reject()");
                        	gp1.Reject();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println("GasPump-1 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (float a, float b)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCredit");
                    		System.out.println("4. Reject");
                    		System.out.println("5. Approved");
                    		System.out.println("6. Cancel");
                    		System.out.println("7. Regular");
                    		System.out.println("8. Super");
                    		System.out.println("9. StartPump");
                    		System.out.println("10. PumpGallon");
                    		System.out.println("11. StopPump");
                    		System.out.println("12. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 5: //approved
                        	System.out.println("Operation:  Approved()");
                        	gp1.Approved();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println("GasPump-1 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (float a, float b)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCredit");
                    		System.out.println("4. Reject");
                    		System.out.println("5. Approved");
                    		System.out.println("6. Cancel");
                    		System.out.println("7. Regular");
                    		System.out.println("8. Super");
                    		System.out.println("9. StartPump");
                    		System.out.println("10. PumpGallon");
                    		System.out.println("11. StopPump");
                    		System.out.println("12. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 6: //cancel
                        	System.out.println("Operation:  Cancel()");
                        	gp1.Cancel();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println("GasPump-1 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (float a, float b)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCredit");
                    		System.out.println("4. Reject");
                    		System.out.println("5. Approved");
                    		System.out.println("6. Cancel");
                    		System.out.println("7. Regular");
                    		System.out.println("8. Super");
                    		System.out.println("9. StartPump");
                    		System.out.println("10. PumpGallon");
                    		System.out.println("11. StopPump");
                    		System.out.println("12. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 7: //regular
                        	System.out.println("Operation:  Regular()");
                        	gp1.Regular();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println("GasPump-1 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (float a, float b)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCredit");
                    		System.out.println("4. Reject");
                    		System.out.println("5. Approved");
                    		System.out.println("6. Cancel");
                    		System.out.println("7. Regular");
                    		System.out.println("8. Super");
                    		System.out.println("9. StartPump");
                    		System.out.println("10. PumpGallon");
                    		System.out.println("11. StopPump");
                    		System.out.println("12. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 8: //super
                        	System.out.println("Operation:  Super()");
                        	gp1.Super();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println("GasPump-1 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (float a, float b)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCredit");
                    		System.out.println("4. Reject");
                    		System.out.println("5. Approved");
                    		System.out.println("6. Cancel");
                    		System.out.println("7. Regular");
                    		System.out.println("8. Super");
                    		System.out.println("9. StartPump");
                    		System.out.println("10. PumpGallon");
                    		System.out.println("11. StopPump");
                    		System.out.println("12. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 9: //start pump
                        	System.out.println("Operation:  StartPump()");
                        	gp1.StartPump();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println("GasPump-1 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (float a, float b)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCredit");
                    		System.out.println("4. Reject");
                    		System.out.println("5. Approved");
                    		System.out.println("6. Cancel");
                    		System.out.println("7. Regular");
                    		System.out.println("8. Super");
                    		System.out.println("9. StartPump");
                    		System.out.println("10. PumpGallon");
                    		System.out.println("11. StopPump");
                    		System.out.println("12. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 10: //pump gallon
                        	System.out.println("Operation:  PumpGallon()");
                        	gp1.PumpGallon();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println("GasPump-1 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (float a, float b)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCredit");
                    		System.out.println("4. Reject");
                    		System.out.println("5. Approved");
                    		System.out.println("6. Cancel");
                    		System.out.println("7. Regular");
                    		System.out.println("8. Super");
                    		System.out.println("9. StartPump");
                    		System.out.println("10. PumpGallon");
                    		System.out.println("11. StopPump");
                    		System.out.println("12. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 11: //stop pump
                   
                        	System.out.println("Operation:  StopPump()");
                        	gp1.StopPump();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println();
                        	System.out.println("GasPump-1 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (float a, float b)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCredit");
                    		System.out.println("4. Reject");
                    		System.out.println("5. Approved");
                    		System.out.println("6. Cancel");
                    		System.out.println("7. Regular");
                    		System.out.println("8. Super");
                    		System.out.println("9. StartPump");
                    		System.out.println("10. PumpGallon");
                    		System.out.println("11. StopPump");
                    		System.out.println("12. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        default:
                        	System.out.println("Invalid Choice");
                        
	            }
    		}
    		
    	}
    	if(input==2){
    		Concert_AF2 factory=new Concert_AF2();
    		Output op=new Output(factory, factory.GetDataStore());
    		MDAFSM mdaefsm=new MDAFSM(factory,op);
    		GasPump2 gp2=new GasPump2(mdaefsm, factory.GetDataStore());
    		System.out.println("GasPump-2 ");
    		System.out.println("Menu of Operations");
    		System.out.println("1. Activate (int a, int b, int c)");
    		System.out.println("2. Start");
    		System.out.println("3. PayCash");
    		System.out.println("4. Cancel");
    		System.out.println("5. Regular");
    		System.out.println("6. Super");
    		System.out.println("7. Premium");
    		System.out.println("8. StartPump");
    		System.out.println("9. PumpLiter");
    		System.out.println("10. Stop");
    		System.out.println("11. Receipt");
    		System.out.println("12. No Receipt");
    		System.out.println("13. Quit");
    		System.out.println("Enter your choice");
    		while(true){
    			System.out.println("Select Operation");
    			input = Integer.parseInt(br.readLine());
                if(input==0)
                    continue;
                    if(input==13)
	            	break;
                    choice = input;
	            switch(choice)
	            {
                        case 1:   //activate
                            System.out.println("Operation:  Activate(int a, int b, int c)");
                            System.out.println("Enter price for Regular");
                            a1 =Integer.parseInt(br.readLine());
                            System.out.println("Enter price for Premium");
                            c =Integer.parseInt(br.readLine());
                            System.out.println("Enter price for Super");
                            b1 =Integer.parseInt(br.readLine());
                            gp2.Activate(a1, b1,c);
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println("GasPump-2 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (int a, int b, int c)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCash");
                    		System.out.println("4. Cancel");
                    		System.out.println("5. Regular");
                    		System.out.println("6. Super");
                    		System.out.println("7. Premium");
                    		System.out.println("8. StartPump");
                    		System.out.println("9. PumpLiter");
                    		System.out.println("10. Stop");
                    		System.out.println("11. Receipt");
                    		System.out.println("12. No Receipt");
                    		System.out.println("13. Quit");
                    		System.out.println("Enter your choice");
                            break;
                        case 2:  //start
                        	System.out.println("Operation:  Start()");
                        	gp2.Start();
                        	System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println("GasPump-2 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (int a, int b, int c)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCash");
                    		System.out.println("4. Cancel");
                    		System.out.println("5. Regular");
                    		System.out.println("6. Super");
                    		System.out.println("7. Premium");
                    		System.out.println("8. StartPump");
                    		System.out.println("9. PumpLiter");
                    		System.out.println("10. Stop");
                    		System.out.println("11. Receipt");
                    		System.out.println("12. No Receipt");
                    		System.out.println("13. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 3: //pay cash
                        	System.out.println("Operation:  PayCash(int c)");
                        	System.out.println("Enter Cash amount");
                            cash =Integer.parseInt(br.readLine());
                        	gp2.PayCash(cash);
                        	System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println("GasPump-2 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (int a, int b, int c)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCash");
                    		System.out.println("4. Cancel");
                    		System.out.println("5. Regular");
                    		System.out.println("6. Super");
                    		System.out.println("7. Premium");
                    		System.out.println("8. StartPump");
                    		System.out.println("9. PumpLiter");
                    		System.out.println("10. Stop");
                    		System.out.println("11. Receipt");
                    		System.out.println("12. No Receipt");
                    		System.out.println("13. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 4: //cancel
                        	System.out.println("Operation:  Cancel()");
                        	gp2.Cancel();
                        	System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println("GasPump-2 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (int a, int b, int c)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCash");
                    		System.out.println("4. Cancel");
                    		System.out.println("5. Regular");
                    		System.out.println("6. Super");
                    		System.out.println("7. Premium");
                    		System.out.println("8. StartPump");
                    		System.out.println("9. PumpLiter");
                    		System.out.println("10. Stop");
                    		System.out.println("11. Receipt");
                    		System.out.println("12. No Receipt");
                    		System.out.println("13. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 5: //regular
                        	System.out.println("Operation:  Regular()");
                        	gp2.Regular();
                        	System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println("GasPump-2 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (int a, int b, int c)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCash");
                    		System.out.println("4. Cancel");
                    		System.out.println("5. Regular");
                    		System.out.println("6. Super");
                    		System.out.println("7. Premium");
                    		System.out.println("8. StartPump");
                    		System.out.println("9. PumpLiter");
                    		System.out.println("10. Stop");
                    		System.out.println("11. Receipt");
                    		System.out.println("12. No Receipt");
                    		System.out.println("13. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 6: //super
                        	System.out.println("Operation:  Super()");
                        	gp2.Super();
                        	System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println("GasPump-2 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (int a, int b, int c)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCash");
                    		System.out.println("4. Cancel");
                    		System.out.println("5. Regular");
                    		System.out.println("6. Super");
                    		System.out.println("7. Premium");
                    		System.out.println("8. StartPump");
                    		System.out.println("9. PumpLiter");
                    		System.out.println("10. Stop");
                    		System.out.println("11. Receipt");
                    		System.out.println("12. No Receipt");
                    		System.out.println("13. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 7: //premium
                        	System.out.println("Operation:  Premium()");
                        	gp2.Premium();
                        	System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println("GasPump-2 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (int a, int b, int c)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCash");
                    		System.out.println("4. Cancel");
                    		System.out.println("5. Regular");
                    		System.out.println("6. Super");
                    		System.out.println("7. Premium");
                    		System.out.println("8. StartPump");
                    		System.out.println("9. PumpLiter");
                    		System.out.println("10. Stop");
                    		System.out.println("11. Receipt");
                    		System.out.println("12. No Receipt");
                    		System.out.println("13. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 8: //start pump
                        	System.out.println("Operation:  StartPump()");
                        	gp2.StartPump();
                        	System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println("GasPump-2 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (int a, int b, int c)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCash");
                    		System.out.println("4. Cancel");
                    		System.out.println("5. Regular");
                    		System.out.println("6. Super");
                    		System.out.println("7. Premium");
                    		System.out.println("8. StartPump");
                    		System.out.println("9. PumpLiter");
                    		System.out.println("10. Stop");
                    		System.out.println("11. Receipt");
                    		System.out.println("12. No Receipt");
                    		System.out.println("13. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 9: //pump liter
                        	System.out.println("Operation:  PumpLiter()");
                        	gp2.PumpLiter();
                        	System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println("GasPump-2 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (int a, int b, int c)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCash");
                    		System.out.println("4. Cancel");
                    		System.out.println("5. Regular");
                    		System.out.println("6. Super");
                    		System.out.println("7. Premium");
                    		System.out.println("8. StartPump");
                    		System.out.println("9. PumpLiter");
                    		System.out.println("10. Stop");
                    		System.out.println("11. Receipt");
                    		System.out.println("12. No Receipt");
                    		System.out.println("13. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 10: //stop 
                        	System.out.println("Operation:  Stop()");
                        	gp2.Stop();
                        	System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println("GasPump-2 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (int a, int b, int c)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCash");
                    		System.out.println("4. Cancel");
                    		System.out.println("5. Regular");
                    		System.out.println("6. Super");
                    		System.out.println("7. Premium");
                    		System.out.println("8. StartPump");
                    		System.out.println("9. PumpLiter");
                    		System.out.println("10. Stop");
                    		System.out.println("11. Receipt");
                    		System.out.println("12. No Receipt");
                    		System.out.println("13. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 11: //receipt 
                        	System.out.println("Operation:  Receipt()");
                        	gp2.Receipt();
                        	System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println("GasPump-2 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (int a, int b, int c)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCash");
                    		System.out.println("4. Cancel");
                    		System.out.println("5. Regular");
                    		System.out.println("6. Super");
                    		System.out.println("7. Premium");
                    		System.out.println("8. StartPump");
                    		System.out.println("9. PumpLiter");
                    		System.out.println("10. Stop");
                    		System.out.println("11. Receipt");
                    		System.out.println("12. No Receipt");
                    		System.out.println("13. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        case 12: //no receipt 
                        	System.out.println("Operation:  NoReceipt()");
                        	gp2.NoReceipt();
                        	System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println("GasPump-2 ");
                    		System.out.println("Menu of Operations");
                    		System.out.println("1. Activate (int a, int b, int c)");
                    		System.out.println("2. Start");
                    		System.out.println("3. PayCash");
                    		System.out.println("4. Cancel");
                    		System.out.println("5. Regular");
                    		System.out.println("6. Super");
                    		System.out.println("7. Premium");
                    		System.out.println("8. StartPump");
                    		System.out.println("9. PumpLiter");
                    		System.out.println("10. Stop");
                    		System.out.println("11. Receipt");
                    		System.out.println("12. No Receipt");
                    		System.out.println("13. Quit");
                    		System.out.println("Enter your choice");
                        	break;
                        default:
                        	System.out.println("Invalid Choice");
                        
	            }
    		}
    		
    	}
		
	}

    }
    