package designPattern.structure.briage;

import utils.Utils;

public class MemberB extends AbsMemberAction {
    @Override
    public void wantToDo() {
        Utils.print("MemberB");
        action.show();
    }
}
