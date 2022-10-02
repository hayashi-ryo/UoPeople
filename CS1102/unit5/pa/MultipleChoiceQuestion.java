import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question{	
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
	@Override
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
}