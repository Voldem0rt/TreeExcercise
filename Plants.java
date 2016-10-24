import java.util.*;

public interface Plants {
	public boolean isAttached();
	public void setAttached(boolean attached);
	void attach(Plants plant);
	String getPlantName();
	void setPlantName(String name);
	public Collection<Plants> getChildren();
	public void showObjectsTree();
}



