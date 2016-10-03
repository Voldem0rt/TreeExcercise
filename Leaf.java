import java.util.*;

public class Leaf extends Implementation {
	public Leaf(String leafName){
		this.setName(leafName);
		System.out.println("A new leaf " + this.getName());
		this.NameOfObject = leafName;
	};
	
	public void attach(Plants p) {
		System.out.println("Object can't be attached to leaf");
		return;
	};
}
