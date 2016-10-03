import java.util.Collection;
import java.util.ArrayList;
 
public class Trunk extends Implementation {
 Collection<Implementation> attachedBranch = new ArrayList<Implementation>(); 
 
public Trunk(String trunkName){
	this.setName(trunkName);
	System.out.println("A new Trunk " + this.getName());
 }; 
}
