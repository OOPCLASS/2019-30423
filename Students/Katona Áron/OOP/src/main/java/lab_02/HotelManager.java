package lab_02;

public class HotelManager {

    private static final int FIRST_ROOM_NUMBER = 0;
    private static final int LAST_ROOM_NUMBER = 919;
    private static final int LAST_ROOM_NUMBER_PER_FLOOR = 19;

    public static void main(final String[] args) {
        try {
            System.out.println("isClean(1) = " + isClean(1));
            System.out.println("isClean(2) = " + isClean(2));
            System.out.println("isClean(201) = " + isClean(201));
            System.out.println("isClean(202) = " + isClean(202));
        } catch (InvalidRoomNumberException e) {
            e.printStackTrace();
        }
    }

    /**
     * If on second floor then not clean (e.g. 200)
     * If on any other floor and even number then clean
     * Not clean otherwise
     *
     * @param roomNumber XAA (X - floor number, AA - 0->19 room number)
     *                   < 0 && > 920 .. 655 invalid room number
     *                   0->19 is valid room number
     * @return
     */
    public static boolean isClean(int roomNumber) throws InvalidRoomNumberException {
        if (roomNumber < FIRST_ROOM_NUMBER
                || roomNumber > LAST_ROOM_NUMBER
                || roomNumber % 100 > LAST_ROOM_NUMBER_PER_FLOOR) {
            throw new InvalidRoomNumberException(roomNumber);
        }

        if (roomNumber / 100 == 2) {
            return false;
        }
        return roomNumber % 2 == 0;
    }
}