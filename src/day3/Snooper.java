package day3;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Where do you live?");

		JOptionPane.showMessageDialog(null,
				"Your house is going to be clean when you come back. I mean everything is going to be gone. Also there might be a corpse in your house.");

		String option = JOptionPane.showInputDialog("What is your credit card number?");

		JOptionPane.showMessageDialog(null,
				"Ha! Now you are broke and have to live in a box! It wouldn't matter, your house is empty.");

		String birth = JOptionPane.showInputDialog("When is your Birthday?");

		JOptionPane.showMessageDialog(null, "Try having a safe Birthday, if you're awake by then!");

	}

}
