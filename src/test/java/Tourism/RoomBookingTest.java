package Tourism;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoomBookingTest {
	@Test
	public void testRooms1()
	{
		RoomBooking.roomTypes();
		RoomBooking.displayRoomTypes();
		System.out.println("\n");
	}
	
	/**
	 * Choosing Rooms Type
	 */
@Test
public void testSelectingRoomPack2()
{
String choice="Suite";
RoomBooking.SelectingRoomPack(choice);
System.out.println("\n");
}

@Test
public void testSelectingRoomPack3()
{
String choice="";
RoomBooking.SelectingRoomPack(choice);
System.out.println("\n");
}
@Test
public void testSelectingRoomPack4()
{
String choice="Super Deluxe";
RoomBooking.SelectingRoomPack(choice);
System.out.println("\n");
}
/**
 * Adding Rooms
 */
@Test
public void testSelectingRoomPack5()
{
	String roomType="Double";
	int roomPrice=4500;
	boolean valid=RoomBooking.addroomTypes(roomType, roomPrice);
	RoomBooking.displayRoomTypes();
	assertTrue(valid);
	System.out.println("\n");
}

}
/*
 * @Test public void test() { RoomBooking.roomTypes();
 * System.out.println("display"+RoomBooking.Rooms.get("Single")); }
 */