import java.util.ArrayList;
import java.util.Arrays;


public class BirchBranch extends Branch {
	public BirchBranch(String branchName) {
		attachablePlants =	new ArrayList<Class<? extends Plants>>(Arrays.asList(Branch .class, Leaf .class, Fruits .class));
		this.attached = false;
		this.setPlantName(branchName);
		System.out.println("A new BirchBranch " + this.getPlantName());
	};
}
