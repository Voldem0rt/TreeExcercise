 import java.util.*;

public class Branch extends Implementation {
	
	public Branch(String branchName) {
		possibleTypes =	new HashSet<Class<? extends Plants>>(Arrays.asList(Branch.class));
		this.setName(branchName);
		System.out.println("A new Branch " + this.getName());
	};

	/*public static final Collection<Class<? extends Plants>> possibleTypes = 
			new HashSet<Class<? extends Plants>>(Arrays.asList(Branch.class, Leaf.class));
		*/	
}


