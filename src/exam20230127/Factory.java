package exam20230127;
public class Factory {
	
	private String factoryName;
	
	private static Factory instance = null;
	
	public static Factory getInstnace() {
		if(instance == null) {
			instance = new Factory();
		}
		return instance;
	}
	
	private Factory() {}

	public String getFactoryName() {
		return factoryName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}	

	
}
