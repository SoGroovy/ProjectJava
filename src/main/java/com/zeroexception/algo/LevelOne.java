package com.zeroexception.algo;

import org.junit.Test.None;

/**
 * @author Viet Quoc Tran on 4/30/18. www.zeroexception.com
 */


public interface LevelOne {

  /**
   * This function is from https://codefights.com/arcade/intro/level-1/jwr339Kq6e3LQTsfa
   */
  static int add(int param1, int param2) {
    return param1 + param2;
  }

  /**
   * This function is from https://codefights.com/arcade/intro/level-1/egbueTZRRL5Mm4TXN
   */
  static int centuryFromYear(int year) {
    if (year % 100 == 0) {
      return (year / 100);
    } else {
      return (year / 100) + 1;
    }
  }

  /**
   * This function is from https://codefights.com/arcade/intro/level-1/s5PbmwxfECC52PWyQ/description
   */


  public static boolean isPalindrome(String original) {
    String reverse = new StringBuilder(original).reverse().toString();
    return original.equals(reverse);
  }

  /**
   * This function is from https://codefights.com/arcade/intro/level-2/xzKiBHjhoinnpdh6m
   */

  static int adjacentElementsProduct(int[] inputArray) {
    int largestProduct = Integer.MIN_VALUE;
    for (int i = 0; i < inputArray.length - 1; i++) {
      if ((inputArray[i] * inputArray[i + 1]) > largestProduct) {
        largestProduct = inputArray[i] * inputArray[i + 1];
      }
    }
    return largestProduct;
  }

  /**
   * This method is from https://codefights.com/arcade/intro/level-2/yuGuHvcCaFCKk56rJ
   */
  static int shapeArea(int n) {
    int area = 1;
    for (int i = 0; i < n; i++) {
      area = area + (i * 4);
    }
    return area;
  }
  static String getSubstr(String s, int start, int end) {

    return s.substring(start, end);
  }

  static char getMaxLetter(String str){
    char result = str.charAt(0);
    for(int i = 1; i < str.length(); i++){
      if(result < str.charAt(i)){
        result = str.charAt(i);
      }
    }
    return result;
  }

  static int getMaxvalue(int[] arr) {
    int maxValue = arr[0];
    for (int i = 1; i < arr.length; i++){
        if(maxValue < arr[i]){
          maxValue = arr[i];
        }
    }
    return maxValue;
  }

  static int getMinvalue(int[] arr){
    int minValue = arr[0];
    for (int i = 1; i < arr.length; i++){
      if(minValue > arr[i]){
        minValue = arr[i];
      }
    }
    return minValue;
  }
  static int total1(int[] arr){
    int total = 0;
    for(int i = 0; i < arr.length; i++){
      total += arr[i];
    }
    return total;
  }


  static int getFirstDownHillIndex(int[] arr){
    int downHill = 0;
    for(int i = 0; i < arr.length-1; i++){
      if(arr[i] > arr[i+1]) {
        downHill = (i + 1);
        break;
      }
    }
    return downHill;
  }

  static int[] getDeepestValley(int[] arr){
    int[] tempValley = new int[arr.length];
    for(int i = 1; i < arr.length-1; i++){
      if(arr[i]< arr[i+1] && arr[i] < arr[i-1]){
        tempValley[i] = arr[i];
      }
    }

    return new int[]{0, 0};
  }
  static int getLongestPlateau(int[] arr){
    int count = 0, tempCount;
    int longest = arr[0];
    int temp = 0;
    for (int i = 0; i < (arr.length - 1); i++)
    {
      temp = arr[i];
      tempCount = 0;
      for (int j = 1; j < arr.length; j++)
      {
        if (temp == arr[j])
          tempCount++;
      }
      if (tempCount > count)
      {
        longest = temp;
        count = tempCount;
      }
    }
    return longest;
  }

  static int indexOfGreatestConsecutiveSum(int[] arr){
    int greatestSum = Integer.MIN_VALUE;
    int indexOfSum = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length-1; i++){
      if(arr[i]+arr[i+1] >= greatestSum){
        greatestSum = arr[i]+arr[i+1];
        indexOfSum = i;
      }
    }
    return indexOfSum;
  }
  static int[] shiftArrayForward(int[] arr){
    int[] array = new int[arr.length];
    int tempValue = arr[arr.length-1];
    for(int i = arr.length-1; i > 0; i--){
      arr[i] = arr[i-1];
    }
    arr[0] = tempValue;
    return arr;
  }
}
