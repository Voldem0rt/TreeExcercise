import java.util.*;

abstract public class Branch extends Implementation {
	
	protected Collection<Class<? extends Plants>> getAttachables() {
		return this.possibleTypes;
	};

}


