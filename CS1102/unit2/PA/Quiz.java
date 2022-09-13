import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[] args) {
		String question = "What sport requires a team of 11 people to kick a ball into a goal?\n";
		question += "A. Basketball\n";
		question += "B. Rugby\n";
		question += "C. Soccer\n";
		question += "D. volleyball\n";
		question += "E. ping-pong\n";
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			if (answer.equals("C")) {
				JOptionPane.showMessageDialog(null,"Correct!");
				break;
			} else if (answer.contentEquals("A")|
					answer.contentEquals("B")|
					answer.contentEquals("D")|
					answer.contentEquals("E")) {
				JOptionPane.showMessageDialog(null,"Incorrect. Please try again.");
			} else {
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
			}
		}
	}
}
