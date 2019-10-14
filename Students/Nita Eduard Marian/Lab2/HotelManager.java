import java.util.*;

public class HotelManager {
	public static void main(String[] args) {
		int roomNumber = 1212;
		if (HotelManager.isClean(roomNumber) == true) {
			System.out.print("Clean");
		} else {
			System.out.print("Not Clean");
		}
	}

	public static boolean isClean(int roomNumber) {
		if (roomNumber < 0 || roomNumber % 100 > 19 || roomNumber / 100 > 9) {
			System.out.print("wrong input");
			System.exit(1);
		} else {
			if (roomNumber / 100 == 2) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
