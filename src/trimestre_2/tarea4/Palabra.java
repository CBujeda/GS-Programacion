package trimestre_2.tarea4;

public class Palabra {
	
	private String word;
	private int cont;
	public Palabra (String word, int cont) {
		this.word = word;
		this.cont = cont;
	}
	
	public void sumCont() {
		this.cont++;
	}
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	
}
