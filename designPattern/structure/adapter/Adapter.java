package designPattern.structure.adapter;

import utils.Utils;

public class Adapter implements ITarget {
    public Adaptee adaptee = new Adaptee();

    @Override
    public void show() {
        Utils.print("适配前我是 Adapter");
        adaptee.showMemery();
    }
}
