
public class Apple extends Fruits {
	public Apple(String fruitName) {
		this.setName(fruitName);
		System.out.println("A new Apple " + this.getName());
	};
	
	protected boolean isAttachable(Plants plant){
		return false;
	};
}
