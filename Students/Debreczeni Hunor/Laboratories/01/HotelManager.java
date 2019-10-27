package com.lab1;

public class HotelManager {

    private static final int LAST_ROOM_NUMBER = 919;
    private static final int FIRST_ROOM_NUMBER = 0;

    public static void main(String[] args) {
        try {
            if(isClean(20))
                System.out.println("Room is clean");
            else
                System.out.println("Room is not clean");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * If on second floor then not clean (e.g. 200)
     * If on any other floor and even number then clean
     * Not clean otherwise
     *
     * @param roomNumber XAA ( X - Floor nr | AA - Room nr )
     * @return
     */

    public static boolean isClean(int roomNumber) throws IllegalArgumentException {
        if (roomNumber < FIRST_ROOM_NUMBER ||
                roomNumber > LAST_ROOM_NUMBER ||
                roomNumber % 100 >= 20
        )   throw new IllegalArgumentException("Invalid room number");
        if (roomNumber / 100 == 2 ||
                roomNumber % 2 == 1
        )   return false;
        return true;
    }

    public static int bookRoom(String name) {
        return 0;
    }
}
