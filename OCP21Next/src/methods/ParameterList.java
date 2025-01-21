package methods;

public class ParameterList {

    int hunger = 4;// this is an instance variable.
    public static void main(String[] args) {

        ParameterList parameterList
                = new ParameterList();
        parameterList.x();
    }

    public void anotherExample() {
        final int r;
        r = 2;
        //r = 3;
        System.out.println(r);
    }

    public void anotherExample2() {
        int q = 2;
        System.out.println(q);
        System.out.println("must initialize local var before use");
    }





    public void x() {
        final int r2 = 33;
        System.out.println(r2);
    }

    public void sleepItOff() {

        int sleep; //local variable
        test("a",23);
    }

    public void test(String a, int b) {

    }
    //412 to 480

    //428

    public void a(String zee) {

    }

    //public void a(String dog) {
    // cannot, because same method sig
    //}

    public void a2(int x, String y) {

    }

    public void a2(String y, int x) {
        // diff method signature!
    }

    public void shit(String x) throws NullPointerException, IllegalStateException {
        // can throw as many exceptions as you want.
    }






}
