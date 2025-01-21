package methods;

public class MethodsMainHelper {
    public static void main(String[] args) {
        MethodsMain main
                = new MethodsMain();
        main.packagePrivateAccess();
        main.onlyFromSubClassOrSamePackage();
    }
}
