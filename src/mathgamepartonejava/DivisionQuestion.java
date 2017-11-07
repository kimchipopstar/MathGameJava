package mathgamepartonejava;

public class DivisionQuestion extends Question {
	public DivisionQuestion() {
		generateQuestion();
	}
	public void generateQuestion (){
        setQuestion(String.format("%d / %d", getLeftValue(), getRightValue()));
        setAnswer((double)getLeftValue() / getRightValue());
    }
}
