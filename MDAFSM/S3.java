package MDAFSM;

public class S3 implements State{
	MDAFSM m=null;
	public S3(MDAFSM m){
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
		m.op.setPrice(g);
		m.setState(m.getS4State());
	}
	public void Reject(){
		
	}
	public void Cancel(){
		m.op.Cancel_msg();
		m.op.ReturncashA();
		m.setState(m.getSOState());
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
