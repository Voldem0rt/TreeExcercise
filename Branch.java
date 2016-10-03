 import java.util.*;

public class Branch extends Implementation {
  public Branch(String branchName) {
    this.setName(branchName);
    System.out.println("A new Branch " + this.getName());
	};

	public static final Collection<Class<? extends Plants>> possibleTypes = 
			new HashSet<Class<? extends Plants>>(Arrays.asList(Branch.class, Leaf.class));
		
	public void attach(Plants p) {
		if( possibleTypes.contains(Plants.class)) {
			this.attachedObjects.add( p );
			System.out.println("Object " + p.getName() + " was attached\n");
		}
		else { 
			System.out.println("Object " + p.getName() + " couldn't be attached");
		}
	};
	
	
	
	
	
}


