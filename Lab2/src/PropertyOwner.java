import java.util.ArrayList;
import java.util.List;

public class PropertyOwner {
	User u = new User();
	List<Property> listProperties = new ArrayList<>();
	
	public PropertyOwner() {
		super();
	}
	
	public void addProperty(Property p ) {
		listProperties.add(p);
	}
	
	public void removeProperty (Property p) {
		listProperties.remove(p);
	}
}
