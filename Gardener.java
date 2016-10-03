
public class Gardener {
	public static void main(String[] args) {
		  Plants tr1 = new Trunk("tr1");
		  tr1.setName("boba");
		  Plants tr2 = new Trunk("tr2");
		  Plants br1 = new Branch("br1");
		  Plants br2 = new Branch("br2");
		  tr1.attach(br1);
		  br1.attach(br2);
		  br1.attach(tr1);
		  Plants lf1 = new Leaf("lf1");
		  Plants lf2 = new Leaf("lf2");
		  br2.attach(lf1);
		  System.out.println(tr1.getName());
		  lf1.attach(lf2);
		  tr1.attach(br1);
	}
}
 