
public class Gardener {
	public static void main(String[] args) {
		  Trunk tr1 = new Trunk("1");
		  tr1.setName("boba");
		  Trunk tr2 = new Trunk("2");
		  Branch br1 = new Branch("11");
		  Branch br2 = new Branch("12");
		  tr1.attach(br1);
		  br1.attach(br2);
		  Leaf lf1 = new Leaf("121");
		  Leaf lf2 = new Leaf("122");
		  br2.attach(lf1);
		  System.out.println(tr1.getName());
		  lf1.attach(lf2);
	}

}
