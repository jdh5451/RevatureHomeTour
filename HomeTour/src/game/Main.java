package game;

import java.util.Scanner;
import fixtures.*;

public class Main {
	static Scanner myScanner = new Scanner(System.in);
	static RoomManager rm=new RoomManager();
	
	public static void main(String[] args) {
		rm.init();
		Player p=new Player(rm.startingRoom);
		Room lastRoom=p.currentRoom;
		System.out.println("Welcome to the house tour! Please input the command 'go' along with a cardinal direction to navigate the house. Input the command 'leave house' to end the tour.");
		printRoom(p);
		while(!(p.currentRoom.equals(rm.rooms[15]))) {
			if(!(p.currentRoom.equals(lastRoom))) {
				lastRoom=p.currentRoom;
				printRoom(p);
			}
			String[] input=collectInput();
			parse(input, p);
		}
		
	}
	
	private static void printRoom(Player player) {
		System.out.println(player.currentRoom.getName()+"\n \n"+player.currentRoom.getLong()+"\n \nExits:");
		Room[]exits=player.currentRoom.getExits();
		String[] directions= {"North","West","South","East"};
		
		for(int i=0;i<4;i++) {
			if(exits[i]!=null) {
				System.out.println(directions[i]+": "+exits[i].getShort());
			}
		}
	}
	
	private static String[] collectInput() {
		String[] commands=new String[2];
		commands[0]=myScanner.next();
		if(myScanner.hasNext()) commands[1]=myScanner.next();
		else commands[1]=null;
		return commands;
	}

	private static void parse(String[] command, Player player) {
		switch(command[0].toLowerCase()) {
			case "go": if(command[1]!=null) {
					if(player.currentRoom.getExit(command[1])!=null)player.currentRoom=player.currentRoom.getExit(command[1]);
					else System.out.println("Sorry, you can't go that way.");	
				}
				else System.out.println("Please input a direction.");
				
				break;
			
			case "leave": System.out.println("You have ended the tour.");
				player.currentRoom=rm.rooms[15];
				break;
			
			case "north": if(player.currentRoom.getExit(command[1])!=null)player.currentRoom=player.currentRoom.getExit(command[1]);
				else System.out.println("Sorry, you can't go that way.");
				break;
				
			case "south": if(player.currentRoom.getExit(command[1])!=null)player.currentRoom=player.currentRoom.getExit(command[1]);
				else System.out.println("Sorry, you can't go that way.");
				break;
				
			case "east": if(player.currentRoom.getExit(command[1])!=null)player.currentRoom=player.currentRoom.getExit(command[1]);
				else System.out.println("Sorry, you can't go that way.");
				break;
				
			case "west": if(player.currentRoom.getExit(command[1])!=null)player.currentRoom=player.currentRoom.getExit(command[1]);
				else System.out.println("Sorry, you can't go that way.");
				break;
			
			default: System.out.println("Didn't understand that command. Please input a new command.");
				break;
		}
	}
}
