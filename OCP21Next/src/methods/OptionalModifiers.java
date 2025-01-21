package methods;

public class OptionalModifiers {
    public static void main(String[] args) {

        test();
    }

    public static void test() {
        //optional modifier must appear before return type.
        //
        OptionalModifiers optionalModifiers
                = new OptionalModifiers();
        optionalModifiers.test6();
    }

    public final static void test1() {

    }

    public static final void test2() {

        //return type must appear
        //must appear after access modifier
        // must appear after optional specifiers
        // before method name
    }

    public void test4() {
        return;
    }

    public void test5() {

    }

    public int test6() {
        String x = "hey";
        if (x.equals("hey")) {
            return 3;
        }
        //this code cant be reached
        //but no error.
        return 98;
    }

    public int test7() {
        //return 7; // this is ok
        //return 8L; //long cant fit into int!
        return 9;
    }

    public long test8() {
        return 2; //int can fit into long
    }





}
