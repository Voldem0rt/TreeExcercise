
public class BirchLeaf extends Leaf {
	public BirchLeaf(String leafName){
		this.attached = false;
		this.setPlantName(leafName);
		System.out.println("A new leaf " + this.getPlantName());
	};
	
	public void rustle() {
				System.out.println( this.getPlantName() + " Apppleshhh"); 
	};
}
