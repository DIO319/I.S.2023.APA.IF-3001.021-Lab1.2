package domain;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static util.Utility.fill;

public class RecursiveTest {
    private final int N = 10000000; //example1, example2, example4
    private final int M = 100000; //example3
    private final int P = 2000; //example5
    private final int Q = 3000; //example5

    private Recursive recursive;

    public RecursiveTest() {
        this.recursive = new Recursive();

    }

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testMcd() {
        Stopwatch timer = new Stopwatch();
        double result = recursive.mcd(3, 5);
        double result2 = recursive.mcd(2, 4);
        double result3 = recursive.mcd(6, 8);
        double result4 = recursive.mcd(3, 6);
        double result5 = recursive.mcd(4, 8);
        double result6 = recursive.mcd(10, 14);

        double time = timer.elapsedTime();
        String hhmmss = timer.elapsedTimeHMS();
        System.out.println(
                "Test MCD "

                        + "\nResult1: " + util.Utility.format(result)
                        + "\nResult2: " + util.Utility.format(result2)
                        + "\nResult3: " + util.Utility.format(result3)
                        + "\nResult4: " + util.Utility.format(result4)
                        + "\nResult5: " + util.Utility.format(result5)
                        + "\nResult6: " + util.Utility.format(result6)
                        + "\nTn: " + util.Utility.format(time) + " milliseconds"
                        + "\nTn: " + hhmmss + "\n"
        );
    }

    @Test
    public void testAckerman() throws Exception {
        double result = recursive.ackerman(0, 1);
        double result2 = recursive.ackerman(2, 3);
        System.out.println(
                "Test ackerman"

                        + "\nResult: " + util.Utility.format(result)
                        + "\nResult2: " + util.Utility.format(result2)

        );
    }

    public void arreglo() {
        Stopwatch timer = new Stopwatch();
        double time = timer.elapsedTime();
        String hhmmss = timer.elapsedTimeHMS();
        int[] arr = new int [100];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = (int)Math.floor(Math.random() * (100 - 10 + 1) + 10);;
        }

        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" ");

            System.out.println(
                    "Test array"

                            +"\nTn: "+util.Utility.format(time)+" milliseconds"
                            +"\nTn: "+hhmmss+"\n");
    }
}
}
