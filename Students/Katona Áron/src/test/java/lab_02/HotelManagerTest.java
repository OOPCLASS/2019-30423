package lab_02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelManagerTest {
    @Test
    public void testIsClean() throws InvalidRoomNumberException {
        Assertions.assertTrue(HotelManager.isClean(0));
        Assertions.assertFalse(HotelManager.isClean(1));
        Assertions.assertTrue(HotelManager.isClean(2));
        Assertions.assertFalse(HotelManager.isClean(201));
        Assertions.assertFalse(HotelManager.isClean(202));
        Assertions.assertFalse(HotelManager.isClean(901));
        Assertions.assertTrue(HotelManager.isClean(902));
        Assertions.assertThrows(InvalidRoomNumberException.class, () -> HotelManager.isClean(-1));
        Assertions.assertThrows(InvalidRoomNumberException.class, () -> HotelManager.isClean(655));
        Assertions.assertThrows(InvalidRoomNumberException.class, () -> HotelManager.isClean(920));
        Assertions.assertThrows(InvalidRoomNumberException.class, () -> HotelManager.isClean(1000));
        Assertions.assertThrows(InvalidRoomNumberException.class, () -> HotelManager.isClean(20));
    }

}
