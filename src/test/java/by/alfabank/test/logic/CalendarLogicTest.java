package by.alfabank.test.logic;

import org.junit.jupiter.api.Test;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


import static org.junit.jupiter.api.Assertions.*;


public class CalendarLogicTest {

    @Test
    public void getTodayTest()
    {
        Calendar testDay = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dataTest =  dateFormat.format(testDay.getTime());

        String dataLogic = CalendarLogic.getTodayDateString();
        assertNotNull(dataLogic);
        assertEquals(dataTest,dataLogic);
    }

    @Test
    public void getYesterdayDateStringTest()
    {
        Calendar testDay = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        testDay.add(Calendar.DATE, -1);
        String dataTest =  dateFormat.format(testDay.getTime());


        String dataLogic = CalendarLogic.getYesterdayDateString();
        System.out.println(dataLogic);
        System.out.println(dataTest);
        assertNotNull(dataLogic);
        assertEquals(dataTest,dataLogic);

    }

}
