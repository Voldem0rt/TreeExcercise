import java.util.ArrayList;
import java.util.Arrays;


public class BirchBranch extends Branch {
	public BirchBranch(String branchName) {
		possibleTypes =	new ArrayList<Class<? extends Plants>>(Arrays.asList(Branch .class, Leaf .class, Fruits .class));
		this.attached = false;
		this.setName(branchName);
		System.out.println("A new BirchBranch " + this.getName());
	};

	public boolean isAttached() {
		return this.attached;
		}
	
	public void setAttachState(boolean attachState) {
		this.attached = attachState;
	}
	
	protected boolean isAttachable(Plants plant) {
		return (plant instanceof Branch) || (plant instanceof Leaf) || (plant instanceof Fruits);
	};
	

}
