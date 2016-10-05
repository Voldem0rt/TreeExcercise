import java.util.*;

public class Trunk extends Implementation {

	public Trunk(String trunkName){
		possibleTypes =	new ArrayList<Class<? extends Plants>>(Arrays.asList(Branch .class));
		this.setName(trunkName);
		System.out.println("A new Trunk " + this.getName());
	}; 
 
	protected boolean isAttachable(Plants plant) {
		return plant instanceof Branch;
	};
}
