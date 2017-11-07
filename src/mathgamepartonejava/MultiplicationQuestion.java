package mathgamepartonejava;

public class MultiplicationQuestion extends Question {
	public MultiplicationQuestion() {
		generateQuestion();
	}
	public void generateQuestion (){
        setQuestion(String.format("%d * %d", getLeftValue(), getRightValue()));
        setAnswer(getLeftValue() * getRightValue());
    }
}
