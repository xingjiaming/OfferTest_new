package designPattern.structure.facadePattern;

public class Client {
    public static void showA() {
        SubClientA subClientA = new SubClientA();
        subClientA.showA();
    }

    public static void showB() {
        SubClientB subClientB = new SubClientB();
        subClientB.showB();
    }
}
