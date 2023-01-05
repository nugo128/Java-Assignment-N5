package com.example.java_nugzari_rostiashvili;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FlightsUtilTest {
    @Test
    void totalPriceChecker(){
        assertEquals(4480, FlightsUtil.totalFlightPrice(new Flights("Rome", "12-02-2023",32,140)));

    }


}