// Concrete State
class StartState implements State {
    public void doAction() {
        System.out.println("Start State");
    }

	@Override
	public void doAction2() {
		System.out.println("HP 100");
		
	}
}