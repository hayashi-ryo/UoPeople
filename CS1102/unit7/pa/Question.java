import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public abstract class Question {
	// class variable
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	// instance variable
	QuestionDialog question;
	String correctAnswer;
	
	// Constructor
	Question(String question){
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1));
		this.question.add(new JLabel(" "+question+"	",JLabel.CENTER));
		
	}
	
	String ask() {
		question.setVisible(true);
		return question.answer;
	};
	
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
	
	void initQuestionDialog() {
		question.setModal(true);
		question.pack();
		question.setLocationRelativeTo(null);
	}
}
