
public class HotelManager 
{
	/**
	 * @param roomNumber XAA (X - floor number, AA - 0->19 room number) < 0 && > 920
	 * If on second floor then "not clean" (e.g. 200). 
	 * If on any other floor and even number then "clean". "Not clean" otherwise
	 */
	
	private static final int LAST_ROOM_NUMBER = 919;
	private static final int FIRST_ROOM_NUMBER = 0;
	// use final for constants
	
	public static void main(final String[] args) 
	{
		isClean(-1);
		isClean(200);
		isClean(201);
		isClean(1000);
		isClean(614);
		isClean(615);
		isClean(655);
	}

	public static boolean isClean(int roomNumber) 
	{
		if (roomNumber < FIRST_ROOM_NUMBER || roomNumber > LAST_ROOM_NUMBER || (roomNumber % 100 > 19))
			System.out.print(roomNumber + ": invalid room number\n");
		else if ((roomNumber >= 200 && roomNumber <= 219) || roomNumber % 2 != 0)
			System.out.print(roomNumber + ": not clean\n");
		else if (roomNumber % 2 == 0)
			System.out.print(roomNumber + ": clean\n");
		return false;
	}
}