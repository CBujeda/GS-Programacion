package trimestre_2.tareaExtraObjetosyClases;

public class Revisiones extends Trabajos {

	public Revisiones(int id, String description) {
		super(id, description);
		this.setPrecio(this.getPrecio() + 20);
	}
	
}
