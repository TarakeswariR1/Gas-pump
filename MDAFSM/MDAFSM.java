/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MDAFSM;
import Abstract_factory.*;
import Output.*;
/**
 *
 * @author tarak
 */
public class MDAFSM {
	State startS=new StartSt(this);
	State s0=new S0(this);
	State s1=new S1(this);
	State s2=new S2(this);
	State s3=new S3(this);
	State s4=new S4(this);
	State s5=new S5(this);
	State s6=new S6(this);
	State efsmS=null;
	Abstractfactory af=null;
	Output op=null;
	public MDAFSM(Abstractfactory af, Output op){
		efsmS=startS;
		this.af=af;
		this.op=op;
	}
	public void Activate(){
		efsmS.Activate();
		printCurrentState();
	}
	public void Start(){
		efsmS.Start();
		printCurrentState();
	}
	public void PayType(int t){
		efsmS.PayType(t);
		printCurrentState();
	}
	public void Approved(){
		efsmS.Approved();
		printCurrentState();
	}
	public void SelectGas(int g){
		efsmS.SelectGas(g);
		printCurrentState();
	}
	public void Reject(){
		efsmS.Reject();
		printCurrentState();
	}
	public void Cancel(){
		efsmS.Cancel();
		printCurrentState();
	}
	public void StartPump(){
		efsmS.StartPump();
		printCurrentState();
	}
	public void Pump(){
		efsmS.Pump();
		printCurrentState();
	}
	public void StopPump(){
		efsmS.StopPump();
		printCurrentState();
	}
	public void Receipt(){
		efsmS.Receipt();
		printCurrentState();
	}
	public void NoReceipt(){
		efsmS.NoReceipt();
		printCurrentState();
	}
	public void setState(State efsmS){
		this.efsmS=efsmS;
	}
	public State getStartState(){
		return startS;
	}
	public State getSOState(){
		return s0;
	}
	public State getS1State(){
		return s1;
	}
	public State getS2State(){
		return s2;
	}
	public State getS3State(){
		return s3;
	}
	public State getS4State(){
		return s4;
	}
	public State getS5State(){
		return s5;
	}
	public State getS6State(){
		return s6;
	}
	public void printCurrentState(){
		System.out.println("Current State : "+ efsmS.getClass().getName());
	}
}



