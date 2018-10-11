package elseif;

import javax.swing.JOptionPane;

public class areYouHappy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("Are You Happy?");
		if (happy.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing!");
		}
		if (happy.equalsIgnoreCase("No")) {
			String answer = JOptionPane.showInputDialog("Do you want to be happy?");
			if (answer.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
			if (answer.equalsIgnoreCase("No")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
		}

	}
}