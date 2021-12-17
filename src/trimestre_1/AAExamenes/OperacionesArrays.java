package trimestre_1.AAExamenes;

public class OperacionesArrays {
	
	/**
	 * Pre: [pArray] contiene el array de enteros a visualizar
	 * Post: Funcion que recibe un array de enterio y lo muestra por pantalla
	 */
    public static void Visualizararray(int[] pArray){
    	for(int i=0;i<pArray.length;i++) {
    		System.out.print("\t" + pArray[i]);
    	}
    }
    
    /**
     *  Pre: [pMatriz] contiene el array de enteros a visualizar
     *  Post: Funcion que rellena la matriz 5x5 con numeros consecutivos
     */
    public static void Inicializar(int[][] pMatriz){
        int aux = 1; // Creamos la variable aux y la inicializamos a 1
        for(int i=0;i<pMatriz.length;i++) {
        		for(int j=0;j<pMatriz[i].length;j++) {
        			pMatriz[i][j] = aux;
        			aux++;
        		}
        	}
    	}
    
    /**
     * Pre:
     * Post: Funcion que muestra el contenido del array 5x5
     */
    public static void Visualizarmatriz(int[][] PMatriz){
    	System.out.println("\nArray 5x5");
    	for(int i=0;i<PMatriz.length;i++) {
    		for(int j=0;j<PMatriz[i].length;j++) {
    			System.out.print("\t" + PMatriz[i][j]);
    		}
           System.out.println();
        }
    }
}
