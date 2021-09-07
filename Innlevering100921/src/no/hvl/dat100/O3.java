package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		
		String tallTxt = showInputDialog("Skriv et tall");
		int tall = parseInt(tallTxt);
		int fakultet = 1;
		
		if ( tall < 0 ) {
			System.out.println("Ugyldig tall.");
		}
		else if (tall <= 1 ) {
			System.out.println("fakultet av: " + tall + " = " + fakultet);
		}
		else {
			for(int teller = tall; teller >= 2; teller--) {
				fakultet = fakultet * teller;
			}
			System.out.println("fakultet av: " + tall + " = " + fakultet);
		}
	}	
}
