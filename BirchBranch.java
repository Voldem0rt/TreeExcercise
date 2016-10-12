import java.util.ArrayList;
import java.util.Arrays;


public class BirchBranch extends Branch {
	public BirchBranch(String branchName) {
		attachablePlants =	new ArrayList<Class<? extends Plants>>(Arrays.asList(Branch .class, Leaf .class, Fruits .class));
		this.attached = false;
		this.setPlantName(branchName);
		System.out.println("A new BirchBranch " + this.getPlantName());
	};

	public boolean isAttached() {
		return this.attached;
		}
	
	public void setAttached(boolean attached) {
		this.attached = attached;
	}
	
	protected boolean isCompatibleWith(Plants plant) {
		return (plant instanceof Branch) || (plant instanceof Leaf) || (plant instanceof Fruits);
	};
	

}
