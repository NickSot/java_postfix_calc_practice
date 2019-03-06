package test.org.text;

import com.company.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc;
    private double testValue1 = 3.14;
    private double testValue2 = 6.28;

    @Test
    public void testPush(){
        calc = new Calculator();

        calc.push(testValue1);

        Assertions.assertEquals(testValue1, calc.lastValue());
    }

    @Test
    public void testNegate(){
        calc = new Calculator();

        calc.push(testValue1);

        calc.addOperation(new Negate(calc));

        calc.execute("neg");

        Assertions.assertEquals(-testValue1, calc.lastValue(), "Something is terribly wrong with the negation operation!");
    }
    @Test
    public void testAbsolute(){
        calc = new Calculator();

        calc.addOperation(new Absolute(calc));

        calc.push(testValue1);

        calc.execute("abs");

        if (testValue1 < 0)
            testValue1 = -testValue1;

        Assertions.assertEquals(testValue1, calc.lastValue());
    }

    @Test
    public void testAdd(){
        calc = new Calculator();

        calc.addOperation(new Add(calc));

        calc.push(testValue1);

        calc.push(testValue2);

        calc.execute("+");

        Assertions.assertEquals(testValue1 + testValue2, calc.lastValue());
    }
}
