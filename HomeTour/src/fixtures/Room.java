package fixtures;

public class Room extends Fixture {
	public Room[] exits;
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4]; // size is your choice
	}
	
	//simple get for the exits array
	public Room[] getExits() {
		return this.exits;
	}
	
	//get for a specific room based on a direction
	public Room getExit(String direction) {
		//switch on north/south/east/west
		switch(direction.toLowerCase()) {
			case "north":
				if(exits[0]!=null) {
					return exits[0];
				} else {
					System.out.println("Cannot go north!");
				}
				break;
			case "west":
				if(exits[1]!=null) {
					return exits[1];
				} else {
					System.out.println("Cannot go west!");
				}
				break;
			case "south":
				if(exits[2]!=null) {
					return exits[2];
				} else {
					System.out.println("Cannot go south!");
				}
				break;
			case "east":
				if(exits[3]!=null) {
					return exits[3];
				} else {
					System.out.println("Cannot go east!");
				}
				break;
			default:
				System.out.println("Sorry, I don't understand that direction.");
				break;
		}
		
		return null;
	}
	
	public String getName() {
		return name;
	}
	
	public String getShort() {
		return shortDescription;
	}
	
	public String getLong() {
		return longDescription;
	}
}
