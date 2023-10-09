// Concrete State
class StopState implements State {
    public void doAction() {
        System.out.println("Stop State");
    }

	@Override
	public void doAction2() {
		System.out.println("SP 20");
		
	}
}
