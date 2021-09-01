package designPattern.structure.briage;

import utils.Utils;

public class MemberA extends AbsMemberAction {
    @Override
    public void wantToDo() {
        Utils.print("MemberA");
        action.show();
    }
}
