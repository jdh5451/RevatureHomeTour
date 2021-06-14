package game;

import fixtures.*;

public class RoomManager {
	Room startingRoom;
	
	Room[] rooms;
	
	public void init() {
		rooms=new Room[16];
		
	    Room entry = new Room(
			"Entryway",
			"a small entryway",
			"A small, narrow hallway at the entrance of the house. There's a mirror on the wall to your left," + "\n"
			+ "and a shoe rack on the floor to your right. The floor starts wooden, but transitions to carpet after a few feet."+"\n"
			+ "As you walk forward, there's a staircase up to the east." + "\n"
			+ "To the west, there's a small room with its door slightly ajar." + "\n"
			+ "To the north, you see a room with a dining table.");
		this.rooms[0] = entry;
	    this.startingRoom = entry;
	    
	    Room dining = new Room(
			"Dining Room",
			"a dining room between the living room and kitchen.",
			"An open space with a dining table meant for eating meals. Not elaborate, but still nice." + "\n"
			+ "To the east, you can see the kitchen clearly." + "\n"
			+ "To the west, there's a room with a TV and some couches." +"\n"
			+ "Going south takes you back to the entrance.");
		this.rooms[1] = dining;
	    
	    Room living = new Room(
			"Living Room",
			"a cozy living room",
			"A comfy living room that looks perfect for relaxing in. There's a TV, a couch, and some chairs." + "\n"
			+ "To the south, there's a room with an open door. Inside, you can see bookshelves, and an office chair." +"\n"
			+ "Going east takes you back to the dining room.");
		this.rooms[2] = living;
		
		Room office=new Room(
			"Office",
			"a serious and dignified office",
			"An office with bookshelves, two desks, and some office chairs. Has a window for letting light from outside in." + "\n"
			+"Surprisingly quiet with the door closed; the noise from the living room doesn't really come through."+"\n"
			+ "Going north returns you to the living room.");
		this.rooms[3]=office;
		
		Room kitchen = new Room(
			"Kitchen",
			"a kitchen, fully kitted out",
			"A kitchen that looks to have everything you'd need. Fridge, stove, oven, microwave, sink, and dishwasher all present." + "\n"
			+ "Plenty of cupboards, with a pantry as well. A solid amount of counter space, too!" +"\n"
			+ "To the south, there's a long, but not wide, room behind an open door."+"\n"
			+ "Going west takes you back to the dining room.");
		this.rooms[4] = living;
		
		Room laundry=new Room(
			"Laundry Room",
			"a basic laundry room",
			"A laundry room, complete with washer and dryer. Standard stuff." + "\n"
			+ "Going north returns you to the kitchen.");
		this.rooms[5]=laundry;
		
		Room toilet=new Room(
			"First Floor Bathroom",
			"a tiny bathroom on the first floor",
			"A small bathroom with a sink, mirror, and toilet. Not much else to say here." + "\n"
			+ "Going east returns you to the entryway.");
		this.rooms[6]=toilet;
		
		Room secondFloor=new Room(
			"Second Floor",
			"a hallway on the second floor",
			"A standard hallway on the second floor. Seems to have a few different rooms."+"\n"
			+ "To the north, there's a pull-down staircase that's been revealed for the showcase, again leading up."+"\n"
			+ "To the west, there seems to be a small bedroom."+"\n"
			+ "To the east, there seems to be a larger bedroom."+"\n"
			+ "Going south will take you back down the curved staircase.");
		this.rooms[7]=secondFloor;
		
		Room attic=new Room(
			"Attic",
			"an attic with plenty of space",
			"A spacious attic, with surprisingly little dust. Could probably be used as a bedroom, but be careful of bonking your head." + "\n"
			+ "Going south takes you back down to the second floor.");
		this.rooms[8]=attic;
		
		Room smallBed=new Room(
			"Small Bedroom",
			"a bedroom seemingly intended for guests",
			"A smaller, yet still decently spacious, bedroom. Probably intended for housing guests, but a bedroom's a bedroom."+"\n"
			+ "To the north, there's a door to a narrow room."+"\n"
			+ "To the south, there's a door to a well-lit bathroom."+"\n"
			+ "Going back east returns you to the second floor hallway.");
		this.rooms[9]=smallBed;
		
		Room smallCloset=new Room(
			"Small Closet",
			"a closet attached to the smaller bedroom",
			"A narrow, but still roomy, closet attached to the smaller bedroom. Has just the right amount of space." + "\n"
			+ "Going south returns you to the small bedroom.");
		this.rooms[10]=smallCloset;
		
		Room smallBath=new Room(
			"Small Bathroom",
			"a bathroom attached to the smaller bedroom",
			"A decently-sized bathroom attached to the smaller bedroom. Has a sink, a mirror, a toilet, and a shower." + "\n"
			+ "Going north returns you to the small bedroom.");
		this.rooms[11]=smallBath;
		
		Room largeBed=new Room(
			"Large Bedroom",
			"a large, comfortable bedroom",
			"A bedroom clearly intended to be the 'master' bedroom of the house. Big enough for at least two."+"\n"
			+ "To the north, there's a door to a seemingly sizeable bathroom."+"\n"
			+ "To the south, there's a door to a long, spacious room."+"\n"
			+ "Going back west returns you to the second floor hallway.");
		this.rooms[12]=largeBed;
			
		Room largeCloset=new Room(
			"Large Closet",
			"a spacious closet in the large bedroom",
			"A long, spacious closet with plenty of space for clothes and dressers and whatnot. It's too big, really." + "\n"
			+ "Going north returns you to the large bedroom.");
		this.rooms[13]=largeCloset;
			
		Room largeBath=new Room(
			"Large Bathroom",
			"a large bathroom for the large bedroom",
			"A big bathroom to go with the big bedroom. Has two sinks, a toilet, a shower, and a tub. A bit extra." + "\n"
			+ "Going south returns you to the large bedroom.");
		this.rooms[14]=largeBath;
		
		Room end=new Room("End Tour","end the tour", "end the tour");
		rooms[15]=end;
		
		entry.exits[0]=dining;
		entry.exits[1]=toilet;
		entry.exits[2]=end;
		entry.exits[3]=secondFloor;
		
		dining.exits[1]=kitchen;
		dining.exits[2]=entry;
		dining.exits[3]=living;
		
		living.exits[1]=dining;
		living.exits[2]=office;
		
		office.exits[0]=living;
		
		kitchen.exits[1]=dining;
		kitchen.exits[2]=laundry;
		
		toilet.exits[3]=entry;
		
		secondFloor.exits[0]=attic;
		secondFloor.exits[1]=smallBed;
		secondFloor.exits[2]=entry;
		secondFloor.exits[3]=largeBed;
		
		attic.exits[2]=secondFloor;
		
		smallBed.exits[0]=smallCloset;
		smallBed.exits[2]=smallBath;
		smallBed.exits[3]=secondFloor;
		
		smallCloset.exits[2]=smallBed;
		
		smallBath.exits[0]=smallBed;
		
		largeBed.exits[0]=largeBath;
		largeBed.exits[1]=secondFloor;
		largeBed.exits[2]=largeCloset;
		
		largeBath.exits[2]=largeBed;
		
		largeCloset.exits[0]=largeBed;
	}
}
