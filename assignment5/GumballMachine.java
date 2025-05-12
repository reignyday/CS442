package assignment5;

public class GumballMachine {
 
	State state;
	int count = 0;
 
	public GumballMachine(int numberGumballsIn) {
		count = numberGumballsIn;
 		if (count > 0) {
			state = State.NO_QUARTER;
		} else {
			state = State.SOLD_OUT;
		}
	}
 
	public void insertQuarter() {
		state = state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state = state.ejectQuarter();
	}
 
	public void turnCrank() {
		state = state.turnCrank();
		state = state.dispense(this, count);
	}
 
	void releaseBall() {
		//System.out.println("count =" + count);
		System.out.println("A gumball comes rolling out the slot...");
		if (count > 0) {
			count = count - 1;
			//System.out.println("count =" + count);
		}
	}
	 
	void releaseBall(int prize) {
		if(prize == 2) {
			System.out.println("A second gumball comes rolling out the slot...");
			if (count > 0) {
				count = count - 1;
			}
		}
		else if(prize == 3) {
			System.out.println("A second and third gumball come rolling out of the slot...");
			if (count > 0) {
				count = count - 2;
			}
		}
	}
 
	public int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count += count;
		System.out.println("The gumball machine was just refilled; its new count is: " + this.count);
		state = state.refill();
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}

}	