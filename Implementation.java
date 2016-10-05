import java.util.*;

public abstract class Implementation implements Plants{
	protected String NameOfObject;
	
	public void setName(String name){
		this.NameOfObject = name;
	};
	
	public String getName() {return this.NameOfObject;};
	
	Collection<Plants> attachedObjects = new ArrayList<Plants>();
	//Collection<Class<? extends Plants>> possibleTypes = new HashSet<Class<? extends Plants>>(); 
	
	// method which returns true if object cauld be attached and returns false otherwise

    abstract protected boolean isAttachable(Plants plant);
	
	public void attach(Plants plant) {
		/*if( possibleTypes.contains(Plants.class))*/
		if (isAttachable(plant)) {
			this.attachedObjects.add(plant);
			System.out.println("Object " + plant.getName() + " was attached");
		}
		else 
			System.out.println("Object " + plant.getName() + " couldn't be attached");
	};
}
