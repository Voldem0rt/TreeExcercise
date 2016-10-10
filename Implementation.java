import java.util.*;

public abstract class Implementation implements Plants{
	protected String NameOfObject;
	protected boolean attached = false;
	protected boolean isAttached(){
		return this.attached;
	};
	public void setName(String name){
		this.NameOfObject = name;
	};
	
	public String getName() {return this.NameOfObject;};
	
	Collection<Plants> attachedObjects = new HashSet<Plants>();
	Collection<Class<? extends Plants>> possibleTypes;
	
	// method which returns true if object could be attached and returns false otherwise
    abstract protected boolean isAttachable(Plants plant);
	    
    public void attach(Plants plant) {
		if ( isAttachable(plant) && !(this.isAttached()) ) {
			attachedObjects.add(plant);
			System.out.println("Object " + plant.getName() + " was attached");
			this.attached = true;
		}
		else 
			System.out.println("Object " + plant.getName() + " couldn't be attached");
	};
}
