public class Quiz {
	// main method
	public static void main(String[] args) {
		// create instance
		MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(
				"What sport requires a team of 11 people to kick a ball into a goal?",
				"Basketball",
				"Rugby",
				"Soccer",
				"volleyball",
				"ping-pong",
				"c"
				);
			
		MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
				"What is the world's most populous country?",
				"China",
				"America",
				"India",
				"Brazil",
				"Singapore",
				"a"
				);

		MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
				"What is the largest lake in the world?",
				"Lake Superior",
				"Lake Huron",
				"Lake Victoria",
				"Aral Sea",
				"Caspian Sea",
				"e"
				);
		
		MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
				"What is the fastest animal on the ground?",
				"Ostrich",
				"Cheetah",
				"Dog",
				"Elephant",
				"Lion",
				"b"
				);
		MultipleChoiceQuestion question5 = new MultipleChoiceQuestion(
				"What is the lightest gas?",
				"Helium",
				"Oxygen",
				"Mercury",
				"Hydrogen",
				"Nitrogen",
				"d"
				);
		// call instance method
		question1.check();
		question2.check();
		question3.check();
		question4.check();
		question5.check();
		question5.showResults();
	}
}