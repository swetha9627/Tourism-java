package Tourism;

import static org.junit.Assert.*;

import org.junit.Test;

public class TouristPlaceTest {
/**
 * Testing addplaces
 */
		@Test
	public void test1()
	{
		String touristPlace="Munnar";
		int Price=90000;
		boolean valid=TouristPlaces.addTouristPlace(touristPlace, Price);
		assertTrue(valid);
		TouristPlaces.displayAllTouristPlaces();
		System.out.println("\n");
	}
		/**
		 * Checking Already Exit or Not
		 */
		@Test
		public void test2()
		{
			String touristPlace="Manali";
			int Price=75000;
			boolean valid=TouristPlaces.addTouristPlace(touristPlace, Price);
			assertTrue(valid);
			TouristPlaces.displayAllTouristPlaces();
			System.out.println("\n");
		}
		/**
		 * Testing Remove
		 */
		@Test
		public void test3()
		{
			String touristPlace="Ooty";
			boolean valid=TouristPlaces.removeTouristPlace(touristPlace);
			assertTrue(valid);
			TouristPlaces.displayAllTouristPlaces();
			System.out.println("\n");
		}
		@Test
		public void test4()
		{
			boolean valid=TouristPlaces.replacePlaces("Manali",89000);
			assertTrue(valid);
			TouristPlaces.displayAllTouristPlaces();
			System.out.println("\n");
		}
	
}
