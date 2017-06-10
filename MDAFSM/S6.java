package MDAFSM;

public class S6 implements State {
	MDAFSM m=null;
	public S6(MDAFSM m){
		this.m=m;
	}
	public void Activate(){
		
	}
	public void Start(){
		
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
		m.op.ReturncashB();
		m.op.printReceipt();
		m.setState(m.getSOState());
	}
	public void NoReceipt(){
		m.op.ReturncashB();
		m.op.NoReceipt();
		m.setState(m.getSOState());
	}


}
