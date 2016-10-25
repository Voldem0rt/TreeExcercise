
abstract public class Branch extends AbstractPlant {
	protected boolean isCompatibleWith(Plants plant) {
		return (plant instanceof Branch) || (plant instanceof Leaf) || (plant instanceof Fruits);
	};
	
	public boolean isAttached() {
		return this.attached;
	}
}


