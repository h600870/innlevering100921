package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {
		
		String bruttoTxt = showInputDialog("Brutto lønn: ");
		int brutto = parseInt(bruttoTxt);
		double dbrutto = brutto;
		
		double trinn0 = 0;
		double trinn1 = (0.93 / 100);
		double trinn2 = (2.41 / 100);
		double trinn3 = (11.52 / 100);
		double trinn4 = (14.52 / 100);
		
		if(brutto >=934051) {
			showMessageDialog(null, "Skattetrinn: " + Math.floor(dbrutto * trinn4*100)/100);
		}
		else if (brutto >= 580651) {
			showMessageDialog(null, "Skattetrinn: " + Math.floor(dbrutto * trinn3*100)/100);
		}
		else if (brutto >= 230951) {
			showMessageDialog(null, "Skattetrinn: " + Math.floor(dbrutto * trinn2*100)/100);
		}
		else if (brutto >= 164101) {
			showMessageDialog(null, "Skattetrinn: " + Math.floor(dbrutto * trinn1*100)/100);
		}
		else if (brutto >= 0) {
			showMessageDialog(null, "Skattetrinn: " + Math.floor(dbrutto * trinn0*100)/100);
		}
	}
}