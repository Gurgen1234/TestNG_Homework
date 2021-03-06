package ru.lanit.framework.steps;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.lanit.testng.Counter;

public class MathTest {

    @DataProvider()
    public Object[][] dataMinusTest() {
        return new Object[][]{
                {"4", "2.5", "2", "+"},
                {"5", "2", "rg", "+"},
                {"5", "2", "2", "+"},
                {"4", "2,5", "2", "-"},
                {"4", "2", "rg", "-"},
                {"5", "2", "2", "-"},
                {"4", "2,5", "2", "*"},
                {"4", "2", "rg", "*"},
                {"5", "2", "2", "*"},
                {"4", "2,5", "2", "/"},
                {"4", "2", "rg", "/"},
                {"5", "2", "0", "/"},
        };
    }

    @Test(dataProvider = "dataMinusTest")
    public void minusTest(String res, String firstNum, String secondNum, String oper) {
        Assert.assertNotEquals(res, new Counter().start(firstNum, oper, secondNum), "Значения равны!");
    }

    @DataProvider
    public Object[][] plusTest() {
        return new Object[][]{
                {"4", "2", "2", "+"},
                {"0", "-1", "1", "+"},
                {"8.4", "4.4", "4", "+"},
                {"-1", "0", "-1", "+"},
                {"0", "2", "2", "-"},
                {"-2", "-1", "1", "-"},
                {"0.4", "4.4", "4", "-"},
                {"1", "0", "-1", "-"},
                {"4", "2", "2", "*"},
                {"-1", "-1", "1", "*"},
                {"17.6", "4.4", "4", "*"},
                {"0", "0", "-1", "*"},
                {"1", "2", "2", "/"},
                {"-0.667", "-2", "3", "/"},
                {"1.1", "4.4", "4", "/"},
                {"0", "0", "-1", "/"},
        };
    }
    @Test(dataProvider = "plusTest")
    public void plusTest(String one, String two, String tree, String four) {
        Assert.assertEquals(one, new Counter().start(two,four,tree), one +" != "+ new Counter().start(two,four,tree));
    }
    //@DataProvider
    //public Object[][] dataGranTest() {
    // return new Object[][]{
    //    {"Ошибка: превышен лимит калькулятора +-20000000000000000", "9999999999999998", "9999999999999999", "+"},
    //    {"Ошибка: превышен лимит калькулятора +-20000000000000000", "-9999999999999999", "-9999999999999999", "+"},
    //    {"Ошибка: вводимые данные большое лимита +- 10000000000000000", "10000000000000000", "1", "+"},
    //    {"Ошибка: вводимые данные большое лимита +- 10000000000000000", "1", "-10000000000000000", "+"},
    //    {"Ошибка: превышен лимит калькулятора +-20000000000000000", "9999999999999999-", "9999999999999999", "-"},
    //    {"Ошибка: превышен лимит калькулятора +-20000000000000000", "9999999999999999", "-9999999999999999", "-"},
    //    {"Ошибка: вводимые данные большое лимита +- 10000000000000000", "10000000000000000", "1", "-"},
    //    {"Ошибка: вводимые данные большое лимита +- 10000000000000000", "1", "10000000000000000", "-"},
    //    {"превышен лимит калькулятора +-20000000000000000", "9999999999999999", "9999999999999999", "*"},
    //    {"превышен лимит калькулятора +-20000000000000000", "-9999999999999999", "9999999999999999", "*"},
    //    {"Ошибка: вводимые данные большое лимита +- 10000000000000000", "10000000000000000", "1", "*"},
    //    {"Ошибка: вводимые данные большое лимита +- 10000000000000000", "1", "-10000000000000000", "*"},
    //    {"Ошибка: вводимые данные большое лимита +- 10000000000000000", "10000000000000000", "1", "/"},
    //    {"Ошибка: вводимые данные большое лимита +- 10000000000000000", "1", "-10000000000000000", "/"},
    //    };
    //}
    //@Test(dataProvider = "dataGranTest")
    //public void granTest(String one, String two, String tree, String four) {
    //    Assert.assertEquals(one, new Counter().start(two,four,tree), one +" != "+ new Counter().start(two,four,tree));
    //}
}
