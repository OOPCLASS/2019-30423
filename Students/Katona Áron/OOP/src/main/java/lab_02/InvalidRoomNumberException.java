package lab_02;

public class InvalidRoomNumberException extends Exception {
    public InvalidRoomNumberException(int roomNumber) {
        super(roomNumber + " invalid room number");
    }
}
