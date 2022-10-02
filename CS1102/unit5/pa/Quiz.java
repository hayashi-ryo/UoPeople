public class Quiz {
	// main method
	public static void main(String[] args) {
		// create instance
		// TrueORFalse question
		Question TFquestion1 = new TrueFalseQuestion("An elephant is heavier than an ant.", "TRUE");
		Question TFquestion2 = new TrueFalseQuestion("About 50% of the Earth's surface is ocean.", "FALSE");
		Question TFquestion3 = new TrueFalseQuestion("The deepest point in the ocean is over 9,000 meters.", "TRUE");
		Question TFquestion4 = new TrueFalseQuestion("Oxygen accounts for about 20 percent of the air.", "TRUE");
		Question TFquestion5 = new TrueFalseQuestion("Humans are made up of about 80% water.", "FALSE");
		
		// multiple question
		Question multiQuestion1 = new MultipleChoiceQuestion(
				"What sport requires a team of 11 people to kick a ball into a goal?",
				"Basketball",
				"Rugby",
				"Soccer",
				"volleyball",
				"ping-pong",
				"c"
				);
			
		Question multiQuestion2 = new MultipleChoiceQuestion(
				"What is the world's most populous country?",
				"China",
				"America",
				"India",
				"Brazil",
				"Singapore",
				"a"
				);

		Question multiQuestion3 = new MultipleChoiceQuestion(
				"What is the largest lake in the world?",
				"Lake Superior",
				"Lake Huron",
				"Lake Victoria",
				"Aral Sea",
				"Caspian Sea",
				"e"
				);
		
		Question multiQuestion4 = new MultipleChoiceQuestion(
				"What is the fastest animal on the ground?",
				"Ostrich",
				"Cheetah",
				"Dog",
				"Elephant",
				"Lion",
				"b"
				);
		Question multiQuestion5 = new MultipleChoiceQuestion(
				"What is the lightest gas?",
				"Helium",
				"Oxygen",
				"Mercury",
				"Hydrogen",
				"Nitrogen",
				"d"
				);
		// call instance method
		TFquestion1.check();
		TFquestion2.check();
		TFquestion3.check();
		TFquestion4.check();
		TFquestion5.check();
		multiQuestion1.check();
		multiQuestion2.check();
		multiQuestion3.check();
		multiQuestion4.check();
		multiQuestion5.check();
		TFquestion5.showResults();
	}
}