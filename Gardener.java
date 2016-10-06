import java.util.*;
public class Gardener {
	public static void main(String[] args) {
		  Plants tr1 = new Trunk("tr1");
		  Plants tr2 = new Trunk("tr2");
		  Plants br1 = new BirchBranch("bir_br1");
		  Plants br2 = new BirchBranch("bir_br2");
		  tr1.attach(br1);
		  br1.attach(br2);
		  br1.attach(tr1);
		  Plants lf1 = new Leaf("lf1");
		  Plants lf2 = new Leaf("lf2");
		  br2.attach(lf1);
		  lf1.attach(lf2);
		  tr1.attach(br1);
		  tr1.attach(tr2);
		  Plants apl1 = new Apple("aplochko");
		  apl1.attach(lf1);
		  br1.attach(apl1);
		  br2.attach(apl1);
		 
	}
}
 