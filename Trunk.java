import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
 
public class Trunk extends Implementation {

	public Trunk(String trunkName){
		possibleTypes =	new HashSet<Class<? extends Plants>>(Arrays.asList(Branch.class));
		this.setName(trunkName);
		System.out.println("A new Trunk " + this.getName());
	}; 
 
	

}
