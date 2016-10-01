 import java.util.Collection;
import java.util.ArrayList;
 
public class Trunk extends Implementation {
 Collection<Implementation> attachedBranch = new ArrayList<Implementation>(); 
 
public Trunk(String trunkName){
	System.out.println("A new Trunk " + trunkName);
 }

 public void attach(Implementation b){
  this.attachedBranch.add(b);
  System.out.println("Branch was attached to trunk\n");
 }
 
}
