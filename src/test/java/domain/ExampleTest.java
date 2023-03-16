package domain;

import static org.testng.Assert.*;

public class ExampleTest {
    private final int N=10000000;
    private int a[];
    private Example example;

    //Constructor
    public ExampleTest() {
        this.example = new Example();
        this.a = new int[N];
        fill(a);
    }

    private void fill(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            a[i] = util.Utility.random(99);
        }
    }

    @org.testng.annotations.BeforeMethod
    public void setUp() {
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() {
    }

    @org.testng.annotations.Test
    public void testExample1() {
        Stopwatch timer = new Stopwatch();
        int result = example.example1(a);
        double time = timer.elapsedTime();
        String hhmmss = timer.elapsedTimeHMS();
        System.out.println(
                "Test Example 1"
                +"\nn: "+util.Utility.format(N)
                +"\nResult: "+util.Utility.format(result)
                +"\nTn: "+util.Utility.format(time)+" milliseconds"
                +"\nTn: "+hhmmss+"\n"
        );
    }

    @org.testng.annotations.Test
    public void testExample2() {
        Stopwatch timer = new Stopwatch();
        int result = example.example2(a);
        double time = timer.elapsedTime();
        String hhmmss = timer.elapsedTimeHMS();
        System.out.println(
                "Test Example 2"
                        +"\nn: "+util.Utility.format(N)
                        +"\nResult: "+util.Utility.format(result)
                        +"\nTn: "+util.Utility.format(time)+" milliseconds"
                        +"\nTn: "+hhmmss+"\n"
        );
    }

    @org.testng.annotations.Test
    public void testExample3() {
    }

    @org.testng.annotations.Test
    public void testExample4() {
    }

    @org.testng.annotations.Test
    public void testExample5() {
    }
}