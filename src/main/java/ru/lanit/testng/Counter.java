package ru.lanit.testng;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class Counter {
    public String start(String firstNum, String oper, String secondNum) {
        try {
            BigDecimal result;
            BigDecimal firstNumD = new BigDecimal(firstNum);
            BigDecimal secondNumD = new BigDecimal(secondNum);
            switch (oper) {
                case ("+"):
                    result =  firstNumD.add(secondNumD);
                    return ocr(result);
                case ("-"):
                    result =  firstNumD.subtract(secondNumD);
                    return ocr(result);
                case ("*"):
                    result =  firstNumD.multiply(secondNumD);
                return ocr(result);
                case ("/"):
                    try {
                        result =  firstNumD.divide(secondNumD, 3, RoundingMode.HALF_UP);
                        return result.stripTrailingZeros().toString();
                    } catch (ArithmeticException ex){
                        return "Ошибка: деление на 0 ";
                    }
                default:
                    return "";
            }

        }
        catch (NumberFormatException ex){
            return "Ошибка: входных данных";
        }
    }
    public String ocr (BigDecimal a){
            BigDecimal result = a;
            result = result.setScale(3, BigDecimal.ROUND_HALF_UP);
            result = result.stripTrailingZeros();
            return result.toString();

    }
}
