package trimestre_2.clasesYobjetos2.ejercicio3;

public class Matriz {

	public int[][] matrix;
	
	public Matriz(int[][] matrix) {
	this.matrix = matrix;	
	}
	
	
	public int getNumberRows() {
		return this.matrix[0].length;
		
	}
	public int getNumberColumns() {
		return this.matrix.length;
	}
	public void setElement(int x, int j, int element) {
		this.matrix[x][j] = element;
	}
	public void addMatrix(int[][] matrix) {
		if(this.matrix.length == matrix.length && this.matrix[0].length == matrix[0].length) {
			for(int i = 0; i < this.matrix.length; i++) {
				for(int j = 0; j < this.matrix[i].length; j++) {
					this.matrix[i][j] = this.matrix[i][j] + matrix[i][j];
				}
			}
		}else {
			System.out.println("Error: Se esperaban tablas de la misma longitud en anchura y altura");
		}
	}
	public void multMatrix(int[][] matrix) {
		if(this.matrix.length == matrix.length && this.matrix[0].length == matrix[0].length) {
			for(int i = 0; i < this.matrix.length; i++) {
				for(int j = 0; j < this.matrix[i].length; j++) {
					this.matrix[i][j] = this.matrix[i][j] * matrix[i][j];
				}
			}
		}else {
			System.out.println("Error: Se esperaban tablas de la misma longitud en anchura y altura");
		}
	}
}
