import java.util.*;

public class Branch extends Implementation {
	
	public Branch(String branchName) {
		possibleTypes =	new ArrayList<Class<? extends Plants>>(Arrays.asList(Branch.class, Leaf.class));
		this.setName(branchName);
		System.out.println("A new Branch " + this.getName());
	};

	protected Collection<Class<? extends Plants>> getAttachables() {
		return this.possibleTypes;
	};

}


