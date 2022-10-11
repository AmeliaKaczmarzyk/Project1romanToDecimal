import static org.junit.Assert.*;

public class RomanToDecimalTest {

    @org.junit.Test
    public void romanToDecimal() {
        assertEquals(RomanToDecimal.romanToDecimal("XIV"), 14);
        assertEquals(RomanToDecimal.romanToDecimal("XVI"), 16);
        assertEquals(RomanToDecimal.romanToDecimal("IMM"), 1999);
        assertEquals(RomanToDecimal.romanToDecimal("MMMCCCI"), 3301);
        assertEquals(RomanToDecimal.romanToDecimal("IX"), 9);
        assertEquals(RomanToDecimal.romanToDecimal("XI"), 11);
        assertEquals(RomanToDecimal.romanToDecimal("MDCLXVI"), 1666);
        assertEquals(RomanToDecimal.romanToDecimal("IM"), 999);
        assertEquals(RomanToDecimal.romanToDecimal("MI"), 1001);
        assertEquals(RomanToDecimal.romanToDecimal("I"), 1);

        assertEquals(RomanToDecimal.romanToDecimal("XIVIXI"), 24);
        assertEquals(RomanToDecimal.romanToDecimal("iviii"), 7);
        assertEquals(RomanToDecimal.romanToDecimal("iCd"), 399);
        assertEquals(RomanToDecimal.romanToDecimal("CCD"), 500);


        assertEquals(RomanToDecimal.romanToDecimal("14"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("+"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("XVIICDMa"), -1);
        assertEquals(RomanToDecimal.romanToDecimal("abc"), -1);
        assertNotEquals(RomanToDecimal.romanToDecimal("Phone"),100);
        assertNotEquals(RomanToDecimal.romanToDecimal("LV"),45);
    }
}