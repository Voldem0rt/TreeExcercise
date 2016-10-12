
public class Apple extends Fruits {
	public Apple(String fruitName) {
		this.setPlantName(fruitName);
		System.out.println("A new Apple " + this.getPlantName());
		this.plantName = fruitName;
	};
	
	public boolean isAttached() {
		return this.attached;
		}
	
	public void setAttached(boolean attached) {
		this.attached = attached;
	}
	
	protected boolean isCompatibleWith(Plants plant){
		return false;
	};
}
