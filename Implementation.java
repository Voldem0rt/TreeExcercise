public abstract class Implementation implements Plants{
	protected String NameOfObject;
	
	public void setName(String name){
		this.NameOfObject = name;
	};
	public void attach(Plants i) {};
	public String getName() {return this.NameOfObject;};
}
