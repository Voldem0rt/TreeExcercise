
abstract public class Branch extends AbstractPlant {
	protected boolean isCompatibleWith(Plants plant) {
		return (plant instanceof Branch) || (plant instanceof Leaf) || (plant instanceof Fruits);
	};
	
	public void rustle() {
		for (Plants p : this.getChildren()) {
				p.rustle();
		} 
	};
}


