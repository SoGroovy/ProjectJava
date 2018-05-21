package algorithms;

import java.util.Scanner;

/**
 * @author Viet Quoc Tran
 * on 4/30/18.
 * www.zeroexception.com
 */


public interface CodeFightIntro {

    /**
     * This function is from https://codefights.com/arcade/intro/level-1/jwr339Kq6e3LQTsfa
     *
     * @param param1
     * @param param2
     * @return
     */
    static int add(int param1, int param2) {
        return param1 + param2;
    }

    /**
     * This function is from https://codefights.com/arcade/intro/level-1/egbueTZRRL5Mm4TXN
     *
     * @param year
     * @return
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
     * @param inputArray
     * @return
     */

    int adjacentElementsProduct(int[] inputArray) {
        int largestProduct = Integer.MIN_VALUE;
        for(int i = 0; i < inputArray.length-1; i++){
            if((inputArray[i]*inputArray[i+1])>largestProduct){
                largestProduct = inputArray[i]*inputArray[i+1];
            }
        }
        return largestProduct;
    }

}
