package MDAFSM;

public class S2 implements State{
	MDAFSM m=null;
	public S2(MDAFSM m){
		this.m=m;
	}
	public void Activate(){
		
	}
	public void Start(){
		
	}
	public void PayType(int t){
		
	}
	public void Approved(){
		m.op.displayMenu();
		m.setState(m.getS3State());
	}
	public void SelectGas(int g){
		
	}
	public void Reject(){
		m.op.rejectMsg();
		m.setState(m.getSOState());
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
