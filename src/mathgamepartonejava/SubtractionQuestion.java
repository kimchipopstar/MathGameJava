package mathgamepartonejava;

public class SubtractionQuestion extends Question {
	public SubtractionQuestion() {
		generateQuestion();
	}
	
	public void generateQuestion (){
        setQuestion(String.format("%d - %d", getLeftValue(), getRightValue()));
        setAnswer(getLeftValue() - getRightValue());
    }

}
