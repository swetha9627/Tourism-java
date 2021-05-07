package Tourism;
import java.util.*;
public class RoomBooking {
	static HashMap<String, Integer> Rooms = new HashMap<String,Integer>();
	public static void roomTypes()
	{
	Rooms.put("Single", 1500);
	Rooms.put("Deluxe", 2500);
	Rooms.put("Suite",3500);
	}
	/**
	 * Displaying Various room
	 */
	public static void displayRoomTypes()
	{
		int j=1;
		for(String i:Rooms.keySet())
	{
		int rupee=Rooms.get(i);
		System.out.println(j+". "+i+": Rs:"+rupee);
		j++;
	}
		
	
	}
	/**
	 * Adding Rooms
	 * @param roomType
	 * @param roomprice
	 * @return
	 */
	
	public static boolean addroomTypes( String roomType, int roomprice) {
		Rooms.put(roomType,roomprice);
		return true;
	}
	
		/**
		 * Selecting Room Type
		 * @param choice
		 */
	public static void SelectingRoomPack(String choice)
	{
		
	
	int roomAmount=0;
	switch(choice)
	{
	

	case "Single":
		roomAmount=1500;
		System.out.println("Single Room Charge Will be Rs:"+roomAmount);
		break;
	case "Deluxe":
		roomAmount=2500;
		System.out.println("Deluxe Room charge will be Rs:"+roomAmount);
		break;
	case "Suite":
		roomAmount=3500;
		System.out.println("Suite Room Chare Will Be Rs:"+roomAmount);
		break;
	case "":
		System.out.println("Your Not Selected any Rooms"); break;
		default:
			System.out.println(choice+" is not available");
			break;
	}
	}
	
	
	
	
	
	
	
	
	
	
	/*
	 * public static void main(String[] args) { roomTypes(); displayRoomTypes();
	 * 
	 * displayRoomTypes(); SelectingRoomPack("Single");
	 * 
	 * }
	 * 
	 */	
	}
	
	

	

		
		
