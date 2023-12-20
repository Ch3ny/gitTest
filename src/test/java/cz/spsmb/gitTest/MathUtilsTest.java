package cz.spsmb.gitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @ParametrizedTest
    @ValueSource(ints = {1, 2, 10})
    void secondPowerTest(int number)  {
        double expected = Math.pow(number ,2);
        double result = MathUtils.secondPower(number);
        Assertions.assertEquals(expected, result);
        }
    }
