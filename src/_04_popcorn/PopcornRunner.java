package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) {
	String flavor=JOptionPane.showInputDialog("What flavor of popcorn would you like?");
	Popcorn popcorn=new Popcorn(flavor);
	Microwave microwave=new Microwave();
	microwave.putInMicrowave(popcorn);
	String time =JOptionPane.showInputDialog("How long should I cook it for?");
	int x=Integer.parseInt(time);
	microwave.setTime(x);
	microwave.startMicrowave();
}
}
