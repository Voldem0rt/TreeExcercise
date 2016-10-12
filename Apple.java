
public class Apple extends Fruits {
	public Apple(String fruitName) {
		System.out.println("A new Apple " + this.getPlantName());
		this.plantName = fruitName;
	};
	
	public boolean isAttached() {
		return this.attached;
		}
		
	protected boolean isCompatibleWith(Plants plant){
		return false;
	};
}
