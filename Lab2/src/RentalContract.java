
public class RentalContract {
	int ContractID;
	int PropertyID;
	int TenantID;
	double RentAmount;
	boolean active;
	
	public RentalContract() {
		super();
	}
	
	public void CreatContract() {
		this.active = true;
	}
	
	public void TerminateContract() {
		this.active = false;
	}
}
