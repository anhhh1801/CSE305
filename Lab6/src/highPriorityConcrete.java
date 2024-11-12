
public class highPriorityConcrete implements IrequestProduct{
	private String priority;
	private String expireDay;
	private String status;
	
	@Override
	public IrequestProduct setPriority(String priority) {
		this.priority = "Emergency";
		return this;
	}
	@Override
	public IrequestProduct setExpire (String expireDay) {
		this.expireDay = "12/11/2024";
		return this;
	}
	@Override
	public IrequestProduct setStatus(String status) {
		this.status ="Accept";
		return this;
	}
	@Override
	public request processRequest() {
		System.out.println("Emergency request, out Administer will contact you immidiately!");
		return new request(priority, expireDay, status);
	}
}
