package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
     BalancedBrackets test_Class;
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Before
    public void createBalancedBracketsObject(){
        test_Class = new BalancedBrackets();
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }
    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(test_Class.hasBalancedBrackets(""));
    }
    @Test
    public void oneOpeningBracketReturnsFalse(){
        assertFalse(test_Class.hasBalancedBrackets("Launch[code"));
    }
    @Test
    public void oneClosingBracketReturnsFalse(){
        assertFalse(test_Class.hasBalancedBrackets("Launch]code"));
    }
    @Test
    public void balancedBracketReturnsTrue1(){
        assertTrue(test_Class.hasBalancedBrackets("Launch[code]"));
    }
    @Test
    public void balancedBracketReturnsTrue2(){
        assertTrue(test_Class.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void balancedBracketReturnsTrue3(){
        assertTrue(test_Class.hasBalancedBrackets("[code]"));
    }
    @Test
    public void startWithClosingBracketReturnsFalse1(){
        assertFalse(test_Class.hasBalancedBrackets("]["));
    }
    @Test
    public void startWithClosingBracketReturnsFalse2(){
        assertFalse(test_Class.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void startWithClosingBracketReturnsFalse3(){
        assertFalse(test_Class.hasBalancedBrackets("]Code["));
    }
    @Test
    public void noBracketReturnsTrue(){
        assertTrue(test_Class.hasBalancedBrackets("LaunchCode"));
    }




}
