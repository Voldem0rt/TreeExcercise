
public interface Plants {
	abstract public boolean isAttached();
	abstract public void setAttachState(boolean attachState);
	void attach(Plants plant);
	String getName();
	void setName(String name);
}



