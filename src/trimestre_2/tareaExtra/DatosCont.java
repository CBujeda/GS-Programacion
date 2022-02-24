package trimestre_2.tareaExtra;

public class DatosCont {
	
	private String name;
	private int cont;
	
	public DatosCont(String name) {
		this.name = name;
		this.cont = 1;
	}
	
	public void sumCont() {
		this.cont++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public void setAll(String name, int cont) {
		this.name = name;
		this.cont = cont;
	}
	
	
}
