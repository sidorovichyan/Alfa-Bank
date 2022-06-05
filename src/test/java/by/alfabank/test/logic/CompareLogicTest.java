package by.alfabank.test.logic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CompareLogicTest {


    @Test
    public void firstGreaterSecondTest() {
        boolean logicResultTrue = CompareLogic.firstGreaterSecond("100", "50");
        boolean logicResultFalse = CompareLogic.firstGreaterSecond("30", "600");
        assertTrue(logicResultTrue);
        assertFalse(logicResultFalse);
    }

    @Test
    void convertTest() {
        List<String> arrayStringValue = new ArrayList<String>();
        List<Double> arrayDoubleValueLogic = new ArrayList<Double>();
        List<Double> arrayDoubleValueTest = new ArrayList<Double>();
        for (int i = 0; i < 10; i++) {
            arrayStringValue.add(((int) (1 + Math.random() * 1000)) + "");
            arrayDoubleValueLogic.add(CompareLogic.convert(arrayStringValue.get(i)));
            arrayDoubleValueTest.add(Double.parseDouble(arrayStringValue.get(i)));
        }
        for (int i = 0; i < 10; i++) {
            assertEquals(arrayDoubleValueTest.get(i), arrayDoubleValueLogic.get(i));
        }

    }
}
