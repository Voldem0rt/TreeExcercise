
public class Gardener {
	public static void main(String[] args) {
		  Trunk tr1 = new Trunk("tr1");
		  tr1.setName("boba");
		  Trunk tr2 = new Trunk("tr2");
		  Branch br1 = new Branch("br1");
		  Branch br2 = new Branch("br2");
		  tr1.attach(br1);
		  br1.attach(br2);
		  Leaf lf1 = new Leaf("lf1");
		  Leaf lf2 = new Leaf("lf2");
		  br2.attach(lf1);
		  System.out.println(tr1.getName());
		  lf1.attach(lf2);
	}
}
