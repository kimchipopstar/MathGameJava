package mathgamepartonejava;

public class QuestionFactory {
	
	public Question generateRandomQuestion() {
		int randomIndex = (int)(Math.random()*4);
		if (randomIndex == 0) {
			return new AdditionQuestion();
		} else if (randomIndex == 1){
			return new SubtractionQuestion();
		} else if (randomIndex == 2) {
			return new MultiplicationQuestion();
		} else {
			return new DivisionQuestion();
		}
	}
}
