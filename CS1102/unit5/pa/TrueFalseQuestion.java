import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {

	// constructor
	TrueFalseQuestion(String question, String answer) {
		this.question = "TRUE or FALSE: "+question;
		correctAnswer = answer.toUpperCase();
		if(correctAnswer.contentEquals("F")|correctAnswer.contentEquals("FALSE")|correctAnswer.contentEquals("N")|correctAnswer.contentEquals("NO")) {
			correctAnswer="FALSE";
		} else if(correctAnswer.contentEquals("T")|correctAnswer.contentEquals("TRUE")|correctAnswer.contentEquals("Y")|correctAnswer.contentEquals("YES")) {
			correctAnswer="TRUE";
		}
	}
	
	@Override
	String ask() {
		String answer;
		while (true) {
			answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			if (answer.contentEquals("F")|answer.contentEquals("FALSE")|answer.contentEquals("N")|answer.contentEquals("NO")) {
				answer = "FALSE";
				break;
			} else if(answer.contentEquals("T")|answer.contentEquals("TRUE")|answer.contentEquals("Y")|answer.contentEquals("YES")) {
				answer = "TRUE";
				break;
			} else {
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE or FALSE.");
			}
		}
		return answer;
	}

}
