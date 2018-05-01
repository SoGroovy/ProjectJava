package algorithms;

import org.junit.Test;

import static algorithms.CodeFightIntro.add;
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

}