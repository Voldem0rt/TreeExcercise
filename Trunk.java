import java.util.Collection;
import java.util.ArrayList;
 
public class Trunk extends Implementation {

	public Trunk(String trunkName){
		this.setName(trunkName);
		System.out.println("A new Trunk " + this.getName());
	}; 
 
 	public void attach(Plants p) {
 		this.attachedObjects.add( (Branch)p );
 		System.out.println("Object " + p.getName() + " was attached\n");
 	};
 
}
