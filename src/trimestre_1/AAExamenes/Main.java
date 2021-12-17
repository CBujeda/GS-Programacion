package trimestre_1.AAExamenes;
	
public class Main {
	
	/**
	 * Pre:
	 * Post:inicializa el código Java que se encarga de 
	 * 		visualizar una matriz de 5x5 y mostrar su diagonal principal y secundaria.
	 */
	    public static void main(String[] args) {
	    	int[][] matriz = new int[5][5];
	    	OperacionesArrays.Inicializar(matriz);
	    	OperacionesArrays.Visualizarmatriz(matriz);
	        int[] DiagoPrincipal = new int[matriz.length];
	        int[] DiagoSecundaria = new int[matriz.length];
	        // Rellenamos la matriz de 5x5
	        for(int i=0;i<matriz.length;i++) {
	            for(int j=0;j<matriz[i].length;j++) {
	                if(i==j) {
	                	DiagoPrincipal[i] = matriz[i][j];
	                }
	                if(i+j == matriz.length-1) {
	                    DiagoSecundaria[i] = matriz[i][j];
	                }
	            }
	        }
	        // Mostramos la diagonal principal y secundaria de la matriz 5x5
	        System.out.println("\nDiagonal Principal");  
	        OperacionesArrays.Visualizararray(DiagoPrincipal); 
	        System.out.println("\n\nDiagonal Secundaria");
	        OperacionesArrays.Visualizararray(DiagoSecundaria);
	        System.out.println("\n\n");

	    }
}
