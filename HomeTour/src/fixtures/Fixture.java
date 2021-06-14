package fixtures;

public abstract class Fixture {
	//variables
	protected String name;
	protected String shortDescription;
	protected String longDescription;
	
	public Fixture(String n, String sd, String ld) {
		name=n;
		shortDescription=sd;
		longDescription=ld;
	}
	
	public abstract String getName();
	
	public abstract String getShort();
	
	public abstract String getLong();
}
