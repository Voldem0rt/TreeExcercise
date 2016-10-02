 import java.util.*;

public class Branch extends Implementation {
	public Branch(String branchName) {
		this.NameOfObject = branchName;
		System.out.println("A new Branch " + branchName);
	};
/*
	Collection<Implementation> attachedBranch = new ArrayList<Implementation>();
 	public void attach(Implementation b){
 		this.attachedBranch.add(b);
 		System.out.println("Branch was attached to another branch\n");
 	};
 	
 	Collection<Leaf> attachedLeaf = new ArrayList<Leaf>();
 	public void attach(Leaf l){
 		this.attachedLeaf.add(l);
 		System.out.println("Leaf was attached to branch\n");
 	};
*/
}

