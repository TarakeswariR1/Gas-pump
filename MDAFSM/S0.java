package MDAFSM;

public class S0 implements State {
	MDAFSM m=null;
	public S0(MDAFSM m){
		this.m=m;
	}
	public void Activate(){
		
	}
	public void Start(){
		m.op.PayMsg();
		m.setState(m.getS1State());
	}
	public void PayType(int t){
		
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
