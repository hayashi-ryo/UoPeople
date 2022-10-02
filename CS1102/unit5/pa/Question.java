import javax.swing.JOptionPane;

public abstract class Question {
	// class variable
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	// instance variable
	String question;
	String correctAnswer;
	
	abstract String ask();
	
	void check() {
		nQuestions++;
		String answer = ask();
		
		if (answer.equals(correctAnswer)) {
    		JOptionPane.showMessageDialog(null,"Correct!");
    		nCorrect++;
    	}else {
    		JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is "+correctAnswer+".");
    	}	
	}

	void showResults() {
		JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions.");
	}
	
}
