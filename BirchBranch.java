import java.util.ArrayList;
import java.util.Arrays;


public class BirchBranch extends Branch {
	public BirchBranch(String branchName) {
		possibleTypes =	new ArrayList<Class<? extends Plants>>(Arrays.asList(this.getClass(), Leaf.class));
		this.setName(branchName);
		System.out.println("A new BirchBranch " + this.getName());
	};
}
