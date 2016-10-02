import java.util.*;

public abstract class Implementation implements Plants{
	protected String NameOfObject;
	
	public void setName(String name){
		this.NameOfObject = name;
	};
	
	//enum attObj {Trunk, Branch, Leaf};
	Collection<Plants> attachedObjects = new ArrayList<Plants>();
	public void attach(Plants p) {
		this.attachedObjects.add(p);
 		System.out.println("Object " + p.getName() + " was attached\n");
	};
	public String getName() {return this.NameOfObject;};
}
