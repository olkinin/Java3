package HW7;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @BeforeSuite
    public void startCalculftor() {
        System.out.println("Calculator on");
    }

    @Test(priority = 3)
    public int add() {
        return a + b;
    }

    @Test(priority = 2)
    public int sub() {
        return a - b;
    }

    @Test(priority = 1)
    public int mul() {
        return a * b;
    }

    @Test(priority = 1)
    public int div() {
        return a / b;
    }

    @AfterSuite
    public void off() {
        System.out.println("Calculator off");
    }
}