package MDAFSM;

public class S1 implements State{
	MDAFSM m=null;
	public S1(MDAFSM m){
		this.m=m;
	}
	public void Activate(){
		
	}
	public void Start(){
		
	}
	public void PayType(int t){
		if(t==1){
			m.setState(m.getS2State());
		}
		if(t==2){
			m.op.storeCash();
			m.op.displayMenu();
			m.setState(m.getS3State());
		}
	}
	public void Approved(){
		
	}
	public void SelectGas(int g){
		
	}
	public void Reject(){
		
	}
	public void Cancel(){
		
	}
	public void StartPump(){
		
	}
	public void Pump(){
		
	}
	public void StopPump(){
		
	}
	public void Receipt(){
		
	}
	public void NoReceipt(){
		
	}



}
