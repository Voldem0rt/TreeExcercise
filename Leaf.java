
public class Leaf extends Implementation {
	public Leaf(String leafName){
		//possibleTypes =	new HashSet<Class<? extends Plants>>();
		this.setName(leafName);
		System.out.println("A new leaf " + this.getName());
		this.NameOfObject = leafName;
	};

	protected boolean isAttachable(Plants plant) {
		return false;
	}
}
