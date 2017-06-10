package MDAFSM;

public class S4 implements State{
	MDAFSM m=null;
	public S4(MDAFSM m){
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
		m.op.setInitialValues();
		m.op.ReadyMsg();
		m.setState(m.getS5State());
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
