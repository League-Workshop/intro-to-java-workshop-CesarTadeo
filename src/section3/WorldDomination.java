package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String Bob=JOptionPane.showInputDialog("Do you know how to write a code?");
		// 2. If they say "yes", tell them they will rule the world.
if(Bob.equals("yes")) {
JOptionPane.showMessageDialog(null, "You will now rule the world.");
		// 3. Otherwise, wish them good luck washing dishes.
}
if(Bob.equals("no")) {
		JOptionPane.showMessageDialog(null, "Well the good luck washing dishes");

}
}
}

