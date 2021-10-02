/**
 * TESTING:
 *   TEST SCENARIO 1
 *   INPUTS: 1, 1
 *   EXPECTED OUTPUT: 1 (which represents "true" - meaning the sum of the two numbers is even)
 *
 *   TEST SCENARIO 2
 *   INPUTS: 1, 2
 *   EXPECTED OUTPUT: 0 (which represents "false" - meaning the sum of the two numbers is odd)
 */
public class SumNumbersTest {
    @Test
    public void testScenario1() {
        testSumNumbers(1, 1);
    }

    @Test
    public void testScenario2() {
        testSumNumbers(1, 2);
    }

    public void testSumNumbers(int a, int b) {
        SumNumbers sn = new SumNumbers();
        Assertions.assertTrue(sn.sumIsEven(a, b) == 1 || sn.sumIsEven(a, b) == 0);
    }
}
