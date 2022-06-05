package by.alfabank.test.logic;

public class CompareLogic {

    public static boolean firstGreaterSecond(String firstValue, String secondValue)
    {
        Double firstValueDouble = convert(firstValue);
        Double secondValueDouble = convert(secondValue);
        return firstValueDouble>secondValueDouble;
    }

    public static Double convert(String value)
    {
       return Double.parseDouble(value);
    }


}
