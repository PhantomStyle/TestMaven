package ggg;


import static junit.framework.Assert.assertEquals;
import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 

{

    private Calculator calculator = new Calc();
    @Test
    public void goodTest(){
        assertEquals(1, 1);
    }

    @Test
    public void cointaisYourWord(){

    }

    @Test
    public void summa1Digit(){
        assertEquals(0, calculator.add("0"));
    }
    @Test
    public void summa2Digit(){
        assertEquals(8, calculator.add("2 6"));
    }
    @Test
    public void summaEmptyStr(){
        assertEquals(0, calculator.add(""));
    }
    @Test
    public void summaToMuchDigit(){
        assertEquals(14 ,calculator.add("2 3 4 5"));
    }

    @Test(expected = RuntimeException.class)
    public void summaWithLetter(){
        calculator.add("2 a 4 10");
    }

    @Test
    public void summaWithDividers(){
        assertEquals(10, calculator.add("2,3,5,"));
    }

    @Test
    public void summaWithYourDivider(){
        assertEquals(5, calculator.add("//*2*3"));
    }

    @Test
    public void summaWithoutNegativeDigits(){
        assertEquals(5, calculator.add("2 3 -4 -7"));
    }
}
