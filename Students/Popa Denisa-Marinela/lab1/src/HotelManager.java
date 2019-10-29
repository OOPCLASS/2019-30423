public class HotelManager {

    public static void main(final String[] args) {
        isClean(-1);
        isClean(200);
        isClean(199);
        isClean(114);
        isClean(615);

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
    public static boolean isClean(int roomNumber) {
        if(roomNumber >=200 && roomNumber <= 219)
        { System.out.println("Room "+ roomNumber +"  is not clean");
            return false;}
        if (roomNumber>=1 && roomNumber<=19) {
            if (roomNumber % 2 == 0){
                System.out.println("Clean room"+ roomNumber);
                return true;
            }
            else return false;
        }
        if(roomNumber%100 < 20 && (roomNumber/100)%2 ==0) {
            System.out.println("Clean room" + roomNumber);
            return true;
        }
        else return false;

    }

    }