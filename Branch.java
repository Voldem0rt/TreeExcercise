

public class Branch extends Implementation {
	
	public Branch(String branchName) {
		//possibleTypes =	new HashSet<Class<? extends Plants>>(Arrays.asList(Branch.class));
		this.setName(branchName);
		System.out.println("A new Branch " + this.getName());
	};

	protected boolean isAttachable(Plants plant) {
		return (plant instanceof Branch) || plant instanceof Leaf;
	}
}


