import java.util.*;

public class Trunk extends Implementation {

	public Trunk(String trunkName){
		possibleTypes =	new ArrayList<Class<? extends Plants>>(Arrays.asList(Branch .class));
		this.setName(trunkName);
		System.out.println("A new Trunk " + this.getName());
	}; 
 
	protected Collection<Class<? extends Plants>> getAttachables() {
		return this.possibleTypes;
	};
}
