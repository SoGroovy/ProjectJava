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

    int[] output = new int[2];
    for(int i = 1; i < arr.length-1; i++){
      int maxEffort = 0;
      int effort = 0;
      int deepestValley = 0;
      int j = i - 1;
      if(arr[i] < arr[j] && arr[i] < arr[i+1]){
        effort = Math.abs(arr[j]-arr[i]) + Math.abs(arr[i]-arr[i+1]);
        if(maxEffort < effort){
          maxEffort = effort;
          output[0] = i;
          output[1] = arr[i];
        }
      }
    }
//    output[0] = 4;
//    output[1] = 8;

    return output;
  }
}
