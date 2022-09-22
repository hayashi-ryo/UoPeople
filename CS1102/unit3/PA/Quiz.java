import javax.swing.JOptionPane;

public class Quiz {
	// definition static method
	static String ask(String question) {
		String answer;
		nQuestions++;
		while (true) {
			answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			if (answer.contentEquals("A")|
					answer.contentEquals("B")|
					answer.contentEquals("C")|
					answer.contentEquals("D")|
					answer.contentEquals("E")) {
				break;
			} else {
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
			}
		}
		return answer;
	}
	
	static void check(String question, String correctAnswer) {
		String answer = ask(question);
		if(answer.equals(correctAnswer)) {
			nCorrect++;
			JOptionPane.showMessageDialog(null,"Correct!");
		} else {
			JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is " + correctAnswer + ".");
		}
	}
	// static variable
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	// main method
	public static void main(String[] args) {
		// question1: Correct answer is C
		String question1 = "What sport requires a team of 11 people to kick a ball into a goal?\n";
		question1 += "A. Basketball\n";
		question1 += "B. Rugby\n";
		question1 += "C. Soccer\n";
		question1 += "D. volleyball\n";
		question1 += "E. ping-pong\n";
		check(question1, "C");
		// question2: Correct answer is A
		String question2 = "What is the world's most populous country?\n";
		question2 += "A. China\n";
		question2 += "B. America\n";
		question2 += "C. India\n";
		question2 += "D. Brazil\n";
		question2 += "E. Singapore\n";
		check(question2, "A");
		// question3: Correct answer is E
		String question3 = "What is the largest lake in the world?\n";
		question3 += "A. Lake Superior\n";
		question3 += "B. Lake Huron\n";
		question3 += "C. Lake Victoria\n";
		question3 += "D. Aral Sea\n";
		question3 += "E. Caspian Sea\n";
		check(question3, "E");
		// Display Scores
		JOptionPane.showMessageDialog(null, nCorrect + " out of " + nQuestions);
	}
}