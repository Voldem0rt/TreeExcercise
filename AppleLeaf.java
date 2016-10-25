
public class AppleLeaf extends Leaf {
	public AppleLeaf(String leafName){
		this.attached = false;
		this.setPlantName(leafName);
		System.out.println("A new leaf " + this.getPlantName());
	};
}
