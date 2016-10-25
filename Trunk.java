import java.util.*;

public class Trunk extends AbstractPlant {

	public Trunk(String trunkName){
		this.attached = false;
		attachablePlants =	new ArrayList<Class<? extends Plants>>(Arrays.asList(Branch .class));
		this.setPlantName(trunkName);
		System.out.println("A new Trunk " + this.getPlantName());
	}; 
		
	protected boolean isCompatibleWith(Plants plant) {
		return plant instanceof Branch;
	};
	
	public void rustle() {
		for (Plants p : this.getChildren()) {
		    p.rustle();
		} 
	};
}
