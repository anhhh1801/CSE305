
public interface BuilderContract {
	
	BuilderContract setContractID (String contractID);
	
	BuilderContract setPropertyID (String propertyID);
	
	BuilderContract setTenantID (String tenantID);
	
	BuilderContract setRentAmount (double rentamount);
	
	Contract signContract ();
	
}
