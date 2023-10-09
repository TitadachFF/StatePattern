// Context
class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void execute() {
        state.doAction();
        state.doAction2();
    }
}
