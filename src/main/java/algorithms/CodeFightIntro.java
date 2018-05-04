package algorithms;

/**
 * @author Viet Quoc Tran
 * on 4/30/18.
 * www.zeroexception.com
 */


public interface CodeFightIntro {

    /**
     * This function is from https://codefights.com/arcade/intro/level-1/jwr339Kq6e3LQTsfa
     * @param param1
     * @param param2
     * @return
     */
    static int add(int param1, int param2) {
        return param1 + param2;
    }

    /**
     * This function is from https://codefights.com/arcade/intro/level-1/egbueTZRRL5Mm4TXN
     * @param year
     * @return
     */
    static int centuryFromYear(int year) {
        if (year%100==0){
            return (year/100);
        } else {
            return (year/100) +1;
        }
    }

    /**
     * This function is from https://codefights.com/arcade/intro/level-1/s5PbmwxfECC52PWyQ/description
     */
    import java.util.*;
    public class checkPalindrome{
        public static void main(String[] args);

        Scanner in = new Scanner(System.in);
        System.out.println("Type a string to check for palindrome");
        String s = in.nextLine();

        reversedString = new Stringbuilder(s).reverse.toString();

    if(s.equals(reversedString)){
            return true;
        } else {
            return false;
        }
    }

}
