package com.zeroexception.algo;

import static com.zeroexception.algo.LevelOne.add;
import static com.zeroexception.algo.LevelOne.centuryFromYear;
import static com.zeroexception.algo.LevelOne.isPalindrome;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Viet Quoc Tran vt on 2018-12-26. www.zeroexception.com
 */
public class LevelOneTest {

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
    boolean palin = isPalindrome(input);
    assertEquals(true, palin);
  }
}