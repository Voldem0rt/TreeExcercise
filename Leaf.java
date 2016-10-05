
public class Leaf extends Implementation {
	public Leaf(String leafName){
		this.setName(leafName);
		System.out.println("A new leaf " + this.getName());
		this.NameOfObject = leafName;
	};

	protected boolean isAttachable(Plants plant) {
		return false;
	};
}
