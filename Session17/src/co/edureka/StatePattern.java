package co.edureka;

import java.util.Date;

interface State{
	
}

class InitialState implements State{
	
	public String toString() {
		return "InitialState";
	}
	
}

class FinalState implements State{
	public String toString() {
		return "FinalState";
	}
}

class Context{
	
	State state; // Has-A Relation
	
	void changeState(State s){
		state = s;
	}
	
	void currentState(){
		System.out.println("Current State is: "+state+" at "+new Date());
	}
}

public class StatePattern {

	public static void main(String[] args) {
		
		Context cxt = new Context();
		State s = new InitialState();
		cxt.changeState(s);
		cxt.currentState();
		
		s = new FinalState();
		cxt.changeState(s);
		cxt.currentState();
		
	}

}
