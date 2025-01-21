package methods;

public class FinalExample {
    public static void main(String[] args) {
        FinalExample finalExample
                = new FinalExample();
        finalExample.doSomething();
    }

    public void doSomething() {
        final A a;
        a = new A();
        //a = null; cannot
        a.setAbra(34); // this is ok. can still modify because pointing to same object

        System.out.println(a);

    }
}

class A {
    private String test;
    private int abra;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public int getAbra() {
        return abra;
    }

    public void setAbra(int abra) {
        this.abra = abra;
    }
}
