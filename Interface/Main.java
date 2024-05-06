package Interface;

import Interface.Parent.Child;

public class Main {
    public static void main(String[] args) {
        Child method = new Child();
        Inherited method2 = new Inherited();

        method.passedMethod();
        method2.passedMethod();
    }
}
