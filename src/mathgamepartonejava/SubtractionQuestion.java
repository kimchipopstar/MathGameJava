package mathgamepartonejava;

public class SubtractionQuestion extends Question {
	
	public void generateQuestion (){
        setQuestion(String.format("%i - %i", getLeftValue(), getRightValue()));
        setAnswer(getLeftValue() + getRightValue());
    }

}
