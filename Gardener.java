public class Gardener {
	public static void main(String[] args) {
		  Plants tr1 = new Trunk("tr1");
		  Plants br1 = new BirchBranch("bir_br1");
		  tr1.attach(br1);
		  Plants lf1 = new Leaf("lf1");
		  br1.attach(lf1);
		  Plants apl1 = new Apple("aplochko");
		  br1.attach(apl1);
		  Plants br2 = new BirchBranch("bir_br2");
		  tr1.attach(br2);
		  tr1.showAttachedObj();
		 
	}
}
 