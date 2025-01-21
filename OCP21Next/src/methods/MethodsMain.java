package methods;

public class MethodsMain {

    public final void nap(int minutes) throws InterruptedException {
        //nap(int minutes) this is called method signature
        // return type
        // method name
        // params
        // signature
        // method body
        // above five are needed

    }

    int nish(int x) {
        return 3;
    }

    public static void main(String[] args) {
        MethodsMain main
                = new MethodsMain();
        int r = main.nish(5);
        System.out.println(r);
        main.onlyCanCallFromThisClass();
    }

    private void onlyCanCallFromThisClass() {
        System.out.println("only from this class");
    }

    public void thisIsPublic() {
        System.out.println("public access");
    }

    void packagePrivateAccess() {
        System.out.println("package private!");
    }

    protected void onlyFromSubClassOrSamePackage() {
        System.out.println("only from sub class or same package");
    }
}
