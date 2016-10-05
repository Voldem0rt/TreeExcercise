
public class BirchBranch extends Branch {
	public BirchBranch(String branchName) {
		this.setName(branchName);
		System.out.println("A new BirchBranch " + this.getName());
	};
	
	protected boolean isAttachable(Plants plant) {
		return (plant instanceof Branch) || plant instanceof Leaf || plant instanceof Fruits;
	};
}
