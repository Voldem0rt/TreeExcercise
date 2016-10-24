
public class Apple extends Fruits {
	public Apple(String fruitName) {
		this.setPlantName(fruitName);
		System.out.println("A new Apple " + this.getPlantName());
	};
	
	public boolean isAttached() {
		return this.attached;
		}
		
	protected boolean isCompatibleWith(Plants plant){
		return false;
	};
}
