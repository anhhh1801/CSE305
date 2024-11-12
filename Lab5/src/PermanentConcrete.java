
public class PermanentConcrete implements BuilderContract {
	
	private String contractID;
	private double rentAmount;
	private String tenantID;
	private String propertyID;
	
	@Override
	public BuilderContract setContractID(String contractID) {
		this.contractID = contractID;
		return this;
	}

	@Override
	public BuilderContract setPropertyID(String propertyID) {
		this.propertyID = propertyID;
		return this;
	}

	@Override
	public BuilderContract setTenantID(String tenantID) {
		this.tenantID = tenantID;
		return this;
	}

	@Override
	public BuilderContract setRentAmount(double rentamount) {
		this.rentAmount = rentamount;
		return this;
	}

	@Override
	public Contract signContract() {
		return new Contract(contractID, propertyID, tenantID, rentAmount);
	}
	
	
}
