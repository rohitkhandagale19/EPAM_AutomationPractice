package TestNG_Project;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(CustomListener.class)
public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

//    @BeforeMethod
//    public void beforeMethod() {
//        calculator = new Calculator();
//        System.out.println("Before Method");
//    }
//
//    @AfterMethod
//    public void afterMethod() {
//        System.out.println("After Method");
//    }

    @AfterClass
    public void tearDown() {
        System.out.println("After class");
        //calculator = null;
    }

    @Test(groups = "Addition")
    public void testSumPositive() {
        Assert.assertEquals(calculator.sum(2, 4), 5);
        Assert.assertEquals(calculator.sum(0, 0), 0);
        Assert.assertEquals(calculator.sum(-2, -3), -5);
        Assert.assertEquals(calculator.sum(0, Integer.MAX_VALUE), Integer.MAX_VALUE);
    }

    @Test(groups = "Addition")
    public void testSumNegative() {
        Assert.assertNotEquals(calculator.sum(2, 3), 6);
        Assert.assertNotEquals(calculator.sum(0, 0), 1);
        Assert.assertNotEquals(calculator.sum(-2, -3), -6);
        Assert.assertNotEquals(calculator.sum(0, Integer.MAX_VALUE), 1);
    }

    @Test(groups = "Subtraction")
    public void testSubPositive() {
        Assert.assertEquals(calculator.sub(5, 3), 2);
        Assert.assertEquals(calculator.sub(0, 0), 0);
        Assert.assertEquals(calculator.sub(-2, -3), 1);
        Assert.assertEquals(calculator.sub(Integer.MAX_VALUE, 0), Integer.MAX_VALUE);
    }

    @Test(groups = "Subtraction")
    public void testSubNegative() {
        Assert.assertNotEquals(calculator.sub(5, 3), 3);
        Assert.assertNotEquals(calculator.sub(0, 0), 1);
        Assert.assertNotEquals(calculator.sub(-2, -3), -1);
        Assert.assertNotEquals(calculator.sub(Integer.MAX_VALUE, 0), Integer.MAX_VALUE - 1);
    }

    @Test(groups = "Multiplication")
    public void testMultPositive() {
        Assert.assertEquals(calculator.mult(2, 3), 6);
        Assert.assertEquals(calculator.mult(0, 0), 0);
        Assert.assertEquals(calculator.mult(-2, -3), 6);
        Assert.assertEquals(calculator.mult(Integer.MAX_VALUE, 1), Integer.MAX_VALUE);
    }

    @Test(groups = "Multiplication")
    public void testMultNegative() {
        Assert.assertNotEquals(calculator.mult(2, 3), 7);
        Assert.assertNotEquals(calculator.mult(0, 0), 1);
        Assert.assertNotEquals(calculator.mult(-2, -3), -6);
        Assert.assertNotEquals(calculator.mult(Integer.MAX_VALUE, 1), Integer.MAX_VALUE - 1);
    }

    @Test(groups = "Division")
    public void testDivPositive() {
        Assert.assertEquals(calculator.div(6, 3), 2);
        Assert.assertEquals(calculator.div(0, 1), 0);
        Assert.assertEquals(calculator.div(-6, -3), 2);
        Assert.assertEquals(calculator.div(Integer.MAX_VALUE, 1), Integer.MAX_VALUE);
    }

    @Test(groups = "Division")
    public void testDivNegative() {
        Assert.assertNotEquals(calculator.div(6, 3), 3);
        Assert.assertNotEquals(calculator.div(0, 1), 1);
        Assert.assertNotEquals(calculator.div(-6, -3), -2);
        Assert.assertNotEquals(calculator.div(Integer.MAX_VALUE, 1), Integer.MAX_VALUE - 1);
    }

    @Test(groups = "Division", expectedExceptions = NumberFormatException.class)
    public void testDivByZero() {
        calculator.div(6, 0);
    }

    @Test(groups = "Power")
    public void testPowPositive() {
        Assert.assertEquals(calculator.pow(2, 3), 8.0);
        Assert.assertEquals(calculator.pow(0, 0), 1.0);
        Assert.assertEquals(calculator.pow(-2, 2), 4.0);
        Assert.assertEquals(calculator.pow(2, -2), 0.25);
    }

    @Test(groups = "Power")
    public void testPowNegative() {
        Assert.assertNotEquals(calculator.pow(2, 3), 7.0);
        Assert.assertNotEquals(calculator.pow(0, 0), 0.0);
        Assert.assertNotEquals(calculator.pow(-2, 2), -4.0);
        Assert.assertNotEquals(calculator.pow(2, -2), 4.0);
    }

    @DataProvider(name = "valuesForSum")
    public Object[][] valuesForSum() {
        return new Object[][]{
                {2, 3, 5},
                {0, 0, 0},
                {-2, -3, -5},
                {0, Integer.MAX_VALUE, Integer.MAX_VALUE}
        };
    }

    @Test(dataProvider = "valuesForSum")
    public void testSumWithDataProvider(int a, int b, int expectedResult) {
        Assert.assertEquals(calculator.sum(a, b), expectedResult);
    }

    @Test(dependsOnGroups = "Addition")
    public void testSubtractAfterAddition() {
        Assert.assertEquals(calculator.sub(5, 3), 2);
    }

    @Test(dependsOnGroups = "Addition", alwaysRun = true)
    public void testMultiplyAfterAddition() {
        Assert.assertEquals(calculator.mult(2, 3), 6);
    }

    @Test(dependsOnGroups = "Addition", enabled = false)
    public void testDivideAfterAddition() {
        Assert.assertEquals(calculator.div(6, 3), 2);
    }

    @Test(dependsOnGroups = "Addition")
    public void testPowerAfterAddition() {
        Assert.assertEquals(calculator.pow(2, 3), 8.0);
    }


}
