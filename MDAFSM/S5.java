package MDAFSM;

public class S5 implements State{
	MDAFSM m=null;
	public S5(MDAFSM m){
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
		m.op.PumpGasUnit();
		m.op.gasPumpedMsg();
		m.setState(m.getS5State());
	}
	public void StopPump(){
		m.op.stopMsg();
		m.setState(m.getS6State());
	}
	public void Receipt(){
		
	}
	public void NoReceipt(){
		
	}

}
