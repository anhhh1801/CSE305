import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome!");
		System.out.println("Enter request type:");
		String type = sc.next();
		switch (type.toLowerCase()) {
		case "low":
			IrequestCreator creator1 = new lowPriorityConcreteCreator();
			request request1 = creator1.createRequest();
			break;
		case "medium":
			creator1 = new midPriorityConcreteCreator();
			request request2 = creator1.createRequest();
			break;
		case "high":
			creator1 = new highPriorityConcreteCreator();
			request request3 = creator1.createRequest();
			break;
		}
	}

}
