/**
*   TESTING:
*   TEST SCENARIO 1
*   INPUTS: $100.00 bill, 20% tip
*   EXPECTED OUTPUT: $20.00
*
*   TEST SCENARIO 2
*   Your choice!
*/
public class TipCalculatorTest {
    @Test
    public void testScenario1() {
        testTipCalculator(100.00, 20);
    }

    @Test
    public void TestScenario2() {
        testTipCalculator(50.00, 15);
    }

    public void testTipCalculator(double bill, int percentage) {
        TipCalculator tc = new TipCalculator();
        Assertions.assertEquals(tc.calculateTip(bill, percentage), (double) Math.round(bill*((double)percentage/100)*100)/100);
    }
}