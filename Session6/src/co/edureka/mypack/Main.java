package co.edureka.mypack;

import co.edureka.packages.One;
//import co.edureka.packages.Two; // error

public class Main {

	public static void main(String[] args) {
		
		One o = new One();
		//o.pvtShow(); //error
		//o.defShow(); //error
		//o.protShow();//error
		o.pubShow();		

	}

}
