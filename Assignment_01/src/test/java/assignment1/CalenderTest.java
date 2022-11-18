package assignment1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalenderTest {
    @Test
    public void NormalNextDayTest()
    {
        Calender calender = new Calender();
        String actual = calender.nextDay(18,11,2022);
        String expected = "19-11-2022";
        assertEquals(expected, actual);
    }

    @Test
    public void LeapYearNextDayTest()
    {
        Calender calender = new Calender();
        String actual = calender.nextDay(28,2,2023);
        String expected = "1-3-2023";
        assertEquals(expected, actual);
    }

    @Test
    public void EndOfYearNextDayTest()
    {
        Calender calender = new Calender();
        String actual = calender.nextDay(31,12,2022);
        String expected = "1-1-2023";
        assertEquals(expected, actual);
    }

    @Test
    public void MonthOf31DaysNextDayTest()
    {
        Calender calender = new Calender();
        String actual = calender.nextDay(31,10,2022);
        String expected = "1-11-2022";
        assertEquals(expected, actual);
    }

    @Test
    public void MonthOf30DaysNextDayTest()
    {
        Calender calender = new Calender();
        String actual = calender.nextDay(30,11,2022);
        String expected = "1-12-2022";
        assertEquals(expected, actual);
    }
}