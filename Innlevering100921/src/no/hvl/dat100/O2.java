package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10;) {
			String poengTxt = showInputDialog("Gi et poeng: ");
			int poeng = parseInt(poengTxt);
			
			if(poeng >100) {
				System.out.println("Ugyldig poengsum!");
			}
			else if(poeng >= 90) {
				System.out.println("Karakter A");
				i++;
			}
			else if(poeng >= 80) {
				System.out.println("Karakter B");
				i++;
			}
			else if(poeng >= 60) {
				System.out.println("Karakter C");
				i++;
			}
			else if(poeng >= 50) {
				System.out.println("Karakter D");
				i++;
			}
			else if(poeng >= 0) {
				System.out.println("Karakter F");
				i++;
			}
			else if(poeng < 0) {
				System.out.println("Ugyldig poengsum!");
			}
		}
	}
}
