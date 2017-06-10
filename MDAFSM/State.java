package MDAFSM;

public interface State {
	public void Activate();
	public void Start();
	public void PayType(int t);
	public void Approved();
	public void SelectGas(int g);
	public void Reject();
	public void Cancel();
	public void StartPump();
	public void Pump();
	public void StopPump();
	public void Receipt();
	public void NoReceipt();

}
