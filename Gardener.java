public class Gardener {
	public static void main(String[] args) {
		  Plants tr1 = new Trunk("tr1");
		  Plants br1 = new BirchBranch("bir_br1");
		  Plants br3 = new BirchBranch("bir_br3");
		  Plants br4 = new BirchBranch("bir_br4");
		  tr1.attach(br1);
		  Plants lf1 = new BirchLeaf("lf1");
		  Plants lf2 = new AppleLeaf("lf2");
		  br1.attach(lf1);
		  Plants apl1 = new Apple("aplochko");
		  br1.attach(apl1);
		  br1.attach(br3);
		  Plants apl2 = new Apple("apl2");
		  Plants apl3 = new Apple("apl3");
		  Plants br2 = new BirchBranch("bir_br2");
		  tr1.attach(br2);
		  br3.attach(apl2);
		  br3.attach(br4);
		  br4.attach(lf2);
		  br4.attach(apl3);
		  //tr1.showObjectsTree();
		 tr1.rustle();
	}
}
 