import java.util.ArrayList;
import java.util.List;

public class Tenant {
	User u = new User();
	RentalContract c = new RentalContract();
	List<RentalContract> listContracts = new ArrayList<>();
	
	public Tenant() {
		super();
	}

	public void requestCreateRentalContract(RentalContract c) {
		listContracts.add(c);
	}
	
	public void  requestTerminateRentalContract (RentalContract c) {
		listContracts.remove(c);
	}
}
