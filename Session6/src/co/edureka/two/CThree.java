package co.edureka.two;

import co.edureka.one.COne;

class CTwo extends COne{
	
	// Inherited things can be either public or protected
	
	void fun(){
		protShow();
		//defShow();
		//pvtShow();
	}
}

public class CThree {

	public static void main(String[] args) {
		
		CTwo cRef = new CTwo();
//		cRef.pvtShow(); errors
//		cRef.defShow();
//		cRef.protShow();
		
		cRef.pubShow();
		cRef.fun();
		

	}

}
