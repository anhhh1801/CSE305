import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Contract ID: ");
		String contractID = sc.next();
		System.out.println("Enter Property ID: ");
		String propertyID = sc.next();
		System.out.println("Enter Tenant ID: ");
		String tenantID = sc.next();
		System.out.println("Enter Rent Amount: ");
		double rentAmount = sc.nextDouble();

		String contractType = sc.next();

		switch (contractType) {
		case "Permanent":
			BuilderContract bc1 = new PermanentConcrete()
				.setContractID(contractID)
				.setPropertyID(propertyID)
				.setRentAmount(rentAmount)
				.setTenantID(tenantID);
			System.out.println(bc1.signContract());
			System.out.println("Contract type: Permanent" );
			break;
		case "LongTerm":
			bc1 = new LongTermConcrete()
				.setContractID(contractID)
				.setPropertyID(propertyID)
				.setRentAmount(rentAmount)
				.setTenantID(tenantID);
			System.out.println(bc1.signContract());
			System.out.println("Contract type: Long Term" );
			break;
		case "ShortTerm":
			bc1 = new ShortTermConcrete()
				.setContractID(contractID)
				.setPropertyID(propertyID)
				.setRentAmount(rentAmount)
				.setTenantID(tenantID);
			System.out.println(bc1.signContract());
			System.out.println("Contract type: Short Term" );
			break;
		}

	}

}
