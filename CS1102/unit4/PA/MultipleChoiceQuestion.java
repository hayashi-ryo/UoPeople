import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {
	// class variable
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	// instance variable
	String question;
	String correctAnswer;
	
	// constructor
	MultipleChoiceQuestion(String query, String a, String b, String c, String d,String e, String answer) {
		question = query+"\n";
		question += "A. "+a+"\n";
		question += "B. "+b+"\n";
		question += "C. "+c+"\n";
		question += "D. "+d+"\n";
		question += "E. "+e+"\n";
		correctAnswer = answer.toUpperCase();
	}	
	
	// instance method
	String ask() {
		String answer;
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
	
	void check() {
		String answer = ask();
		nQuestions++;
		if(answer.equals(correctAnswer)) {
			nCorrect++;
			JOptionPane.showMessageDialog(null,"Correct!");
		} else {
			JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is " + correctAnswer + ".");
		}
	}
	
	void showResults() {
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
	}
}