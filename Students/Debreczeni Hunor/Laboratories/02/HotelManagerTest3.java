package com.lab1;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelManagerTest3 {

    @Test
    void isClean() {
        Assert.check(true, HotelManager.isClean(10));
    }
}