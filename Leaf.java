import java.util.*;

public class Leaf extends Implementation {
	public Leaf(String leafName){
		possibleTypes =	new ArrayList<Class<? extends Plants>>();
		this.setName(leafName);
		System.out.println("A new leaf " + this.getName());
		this.NameOfObject = leafName;
	};

	protected Collection<Class<? extends Plants>> getAttachables() {
		return this.possibleTypes;
	};
}
