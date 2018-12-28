package com.zeroexception.algo;

import static com.zeroexception.algo.LevelOne.add;
import static com.zeroexception.algo.LevelOne.getFirstDownHillIndex;
import static com.zeroexception.algo.LevelOne.getMaxLetter;
import static com.zeroexception.algo.LevelOne.centuryFromYear;
import static com.zeroexception.algo.LevelOne.getMaxvalue;
import static com.zeroexception.algo.LevelOne.getMinvalue;
import static com.zeroexception.algo.LevelOne.getSubstr;
import static com.zeroexception.algo.LevelOne.isPalindrome;
import static com.zeroexception.algo.LevelOne.total1;
import static org.junit.Assert.*;

import org.junit.Test;

/** @author Viet Quoc Tran vt on 2018-12-26. www.zeroexception.com */
public class LevelOneTest {

  @Test
  public void testAdd() {
    int a = add(1, 2);
    assertEquals(3, a);
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
  public void testCenturyFromYear1700() {
    int year = 1700;
    int century = centuryFromYear(year);
    assertEquals(17, century);
  }

  @Test
  public void testCenturyFromYear1988() {
    int year = 1988;
    int century = centuryFromYear(year);
    assertEquals(20, century);
  }

  @Test
  public void testCheckPalindrome() {
    String input = "aabaa";
    boolean palin = isPalindrome(input);
    assertEquals(true, palin);
  }

  @Test
  public void test_getSubstr() {
    assertEquals("e", getSubstr("hello", 1, 2));
  }

  @Test
  public void test_getSubstr2() {
    assertEquals("joh", getSubstr("hello john", 6, 9));
  }

  @Test
  public void test_getSubstr3() {
    assertEquals("b", getSubstr("abc", 1, 2));
  }

  @Test
  public void test_getSubstr4() {
    assertEquals("o W", getSubstr("Hello World", 4, 7));
  }

  @Test
  public void test_getMax1() {
    assertEquals('w', getMaxLetter("hello world"));
  }

  @Test
  public void test_getMaxValue() {
    int[] arr = {0, 3, 4, 2, 9};

    assertEquals(9, getMaxvalue(arr));
  }

  @Test
  public void test_geMinValue() {
    int[] arr = {0, 3, 4, 2, 9};

    assertEquals(0, getMinvalue(arr));
  }

  @Test
  public void test_total1() {
    int[] array = {2, 3, 5, 9, 1};
    assertEquals(20, total1(array));
  }

  @Test
  public void test_getFirstDownHillIndex() {
    int[] arr = {0, 3, 4, 2, 9};

    assertEquals(3, getFirstDownHillIndex(arr));
  }

  @Test
  public void test_getFirstDownHillIndex2() {
    int[] arr = {0, 3, 4, 2, 9, 11, 2,  3};

    assertEquals(3, getFirstDownHillIndex(arr));
  }
}
