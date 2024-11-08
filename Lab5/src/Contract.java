
public class Contract {
	private String ContractID;
	private String PropertyID;
	private String TenantID;
	private double RentAmount;
	
	public Contract(String contractID, String propertyID, String tenantID, double rentAmount) {
		super();
		ContractID = contractID;
		PropertyID = propertyID;
		TenantID = tenantID;
		RentAmount = rentAmount;
	}
	
	
}
