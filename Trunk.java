import java.util.*;

public class Trunk extends Implementation {

	public Trunk(String trunkName){
		this.attached = false;
		possibleTypes =	new ArrayList<Class<? extends Plants>>(Arrays.asList(Branch .class));
		this.setName(trunkName);
		System.out.println("A new Trunk " + this.getName());
	}; 
	
	public boolean isAttached() {
		return this.attached;
		}
	
	public void setAttachState(boolean attachState) {
		this.attached = attachState;
	}
	
	protected boolean isAttachable(Plants plant) {
		return plant instanceof Branch;
	};
}
