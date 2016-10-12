
public class Leaf extends AbstractPlant {
	public Leaf(String leafName){
		this.attached = false;
		this.setPlantName(leafName);
		System.out.println("A new leaf " + this.getPlantName());
		this.plantName = leafName;
	};

	public boolean isAttached() {
		return this.attached;
		}
	
	public void setAttached(boolean attached) {
		this.attached = attached;
	}
	
	protected boolean isCompatibleWith(Plants plant) {
		return false;
	};
}
