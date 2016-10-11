
public class Apple extends Fruits {
	public Apple(String fruitName) {
		this.setName(fruitName);
		System.out.println("A new Apple " + this.getName());
		this.NameOfObject = fruitName;
	};
	
	public boolean isAttached() {
		return this.attached;
		}
	
	public void setAttachState(boolean attachState) {
		this.attached = attachState;
	}
	
	protected boolean isAttachable(Plants plant){
		return false;
	};
}
