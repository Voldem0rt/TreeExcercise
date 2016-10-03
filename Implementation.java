import java.util.*;

public abstract class Implementation implements Plants{
	protected String NameOfObject;
	
	public void setName(String name){
		this.NameOfObject = name;
	};
	Collection<Plants> attachedObjects = new ArrayList<Plants>();
	abstract public void attach(Plants p);
	public String getName() {return this.NameOfObject;};
}
