package algorithms;

import org.junit.Test;

import static algorithms.CodeFightIntro.add;
import static algorithms.CodeFightIntro.centuryFromYear;
import static algorithms.CodeFightIntro.istPalindrom;
import static org.junit.Assert.*;

/**
 * @author Viet Quoc Tran
 * on 4/30/18.
 * www.zeroexception.com
 */


public class CodeFightIntroTest {

    @Test
    public void testAdd() {
        int a = add(1,2);
        assertEquals(3,a);
    }

    @Test
    public void testCenturyFromYear() {
        int year = 2000;
        int expectedValue = 20;
        int actualValue = centuryFromYear(year);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void testCenturyFromYear1905() {
        int year = 1905;
        int century = centuryFromYear(year);
        assertEquals(20, century);
    }
    @Test
    public void testCenturyFromYear1700(){
        int year = 1700;
        int century = centuryFromYear(year);
        assertEquals(17, century);
    }
    @Test
    public void testCenturyFromYear1988(){
        int year = 1988;
        int century = centuryFromYear(year);
        assertEquals(20, century);
    }
    @Test
    public void testCheckPalindrome(){
        String input = "aabaa";
        String palin = istPalindrom(input);
        assertEquals(true, palin);
    }
}