
abstract public class Leaf extends AbstractPlant {
	protected boolean isCompatibleWith(Plants plant) {
		return false;
	};
	
	public boolean isAttached() {
		return this.attached;
	}	
}
