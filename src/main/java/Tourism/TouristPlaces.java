package Tourism;

import java.util.*;

public class TouristPlaces {

	static HashMap<String, Integer> allTouristPlace = new HashMap<String, Integer>();

	static {
		allTouristPlace.put("Ooty", 35000);
		allTouristPlace.put("Goa", 70000);
		allTouristPlace.put("Manali", 75000);
		allTouristPlace.put("Simla", 90000);
		allTouristPlace.put("Kodaikanal", 50000);
	}
	
	/**
	 * adding tourist place with some validation
	 * @param touristPlace
	 * @param price
	 * @return
	 */
	public static boolean addTouristPlace ( String touristPlace, int price) {
		
		if(allTouristPlace.containsKey(touristPlace))//checking if already exits cannot add
		{
			System.out.println("...Already Exit...");
		}
		else {
			allTouristPlace.put(touristPlace,price);
			System.out.println("....Place Added...");
		}
		
		
		return true;
		
	}
	
	/**
	 * displaying tourist places
	 */


	public static void displayAllTouristPlaces() {
		System.out.println(">>>Avaliable Tourist Places<<<");
		for (String i : allTouristPlace.keySet()) {
			int PlaceAmount = allTouristPlace.get(i);
			System.out.println(i + "--- Rs." + PlaceAmount);
		}
	}
	public static boolean replacePlaces(String TouristPlace,int Price)
	{
		allTouristPlace.replace(TouristPlace,Price);
		System.out.println("<<Amount Changed Places>>");
		return true;
	}
	/**
	 * Removing tourist places
	 * @param touristPlace
	 * @return
	 */
	public static boolean removeTouristPlace(String touristPlace)
	{	
	allTouristPlace.remove(touristPlace);
	System.out.println("Place Removed SuccessFully");
	return true;
	}
	
	
}
	
