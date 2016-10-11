
public class Leaf extends Implementation {
	public Leaf(String leafName){
		this.attached = false;
		this.setName(leafName);
		System.out.println("A new leaf " + this.getName());
		this.NameOfObject = leafName;
	};

	public boolean isAttached() {
		return this.attached;
		}
	
	public void setAttachState(boolean attachState) {
		this.attached = attachState;
	}
	
	protected boolean isAttachable(Plants plant) {
		return false;
	};
}
