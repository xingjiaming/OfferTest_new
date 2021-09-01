package designPattern.structure.briage;

public abstract class AbsMemberAction {
    Action action;

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public abstract void wantToDo();
}
