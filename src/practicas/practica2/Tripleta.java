package practicas.practica2;

public class Tripleta {
	
	private int gen;
	private int automatas;
	private int automatas_anteriores;
	public Tripleta(int gen, int automatas, int automatas_anteriores) {
		this.gen = gen;
		this.automatas = automatas;
		this.automatas_anteriores = automatas_anteriores; 
	}
	public int getGen() {
		return gen;
	}
	public void setGen(int gen) {
		this.gen = gen;
	}
	public int getAutomatas() {
		return automatas;
	}
	public void setAutomatas(int automatas) {
		this.automatas = automatas;
	}
	public int getAutomatas_anteriores() {
		return automatas_anteriores;
	}
	public void setAutomatas_anteriores(int automatas_anteriores) {
		this.automatas_anteriores = automatas_anteriores;
	}
	@Override
	public String toString() {
		return "Generacion=" + gen + ", Automatas=" + automatas + ", Automatas Anteriores=" + automatas_anteriores;
	}

	
}
