import java.util.*;

public abstract class AbstractPlant implements Plants{
	protected String plantName;
	protected boolean attached;
		
	public void setPlantName(String name){
		this.plantName = name;
	};
	
	public String getPlantName() {return this.plantName;};
	
	Collection<Plants> attachedObjects = new HashSet<Plants>();
	
	
	Collection<Class<? extends Plants>> attachablePlants;
		
	// method which returns true if object could be attached and returns false otherwise
    abstract protected boolean isCompatibleWith(Plants plant);
	    
    public void attach(Plants plant) {
		if ( isCompatibleWith(plant) & !(plant.isAttached()) ) {
			plant.setAttached(true);
			attachedObjects.add(plant);
			System.out.println("Object " + plant.getPlantName() + " was attached");
		}
		else 
			System.out.println("Object " + plant.getPlantName() + " couldn't be attached");
	};
}
