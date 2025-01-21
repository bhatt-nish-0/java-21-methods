package otherpackagemethods;

import methods.MethodsMain;

public class MethodsMainHelperTwo extends MethodsMain {
    public static void main(String[] args) {
        MethodsMainHelperTwo methodsMainHelperTwo
                = new MethodsMainHelperTwo();
        methodsMainHelperTwo.callUpper();
    }

    public void callUpper() {
        this.onlyFromSubClassOrSamePackage();
        this.thisIsPublic();
    }
}
