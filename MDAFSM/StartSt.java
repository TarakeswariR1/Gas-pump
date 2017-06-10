package MDAFSM;

public class StartSt implements State {
	MDAFSM m=null;
	public StartSt(MDAFSM m){
		this.m=m;
	}
	public void Activate(){
		m.op.StoreData();
		m.setState(m.getSOState());
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
		
	}
	public void NoReceipt(){
		
	}

}
