package trimestre_2.tareaExtraObjetosyClases;

public class Reparaciones extends Trabajos{

	
	private Material material;
	private int tipo;
	public Reparaciones(int id, String description, Material material, int tipo) {

		super(id, description);
		this.setPrecio(this.getHoras()*30);
		this.tipo = tipo;
		this.material = material;
		if(this.tipo == 1) { // 1 = mecanica
			this.setPrecio(this.getPrecio() + (this.material.getCoste()*1.1));
		}else if(this.tipo == 2) { // chapa y pintura
			this.setPrecio(this.getPrecio() + (this.material.getCoste()*1.3));
		} 		
	}
	
	
	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public void setMaterial(Material material) {
		this.material = material;
	}



	
	
	

}
