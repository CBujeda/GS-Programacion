package practicas.practica4;

import java.util.ArrayList;


public class Organizadores {
	
	public static ArrayList<Asignaturas_nip>
		asignaturas_num_creciente(ArrayList<Asignaturas_nip> l){
		Asignaturas_nip temp = new Asignaturas_nip();
		for(int i = 0; i< l.size();i++) {
			for(int j = i +1; j < l.size(); j++) {
				if(l.get(i).getCod_asig() > l.get(j).getCod_asig()) {
					temp.setAll(l.get(j).getNip(),
								l.get(j).getCod_asig(),
								l.get(j).getAsig());
					
					l.get(j).setAll(l.get(i).getNip(),
									l.get(i).getCod_asig(),
									l.get(i).getAsig());

					l.get(i).setAll(temp.getNip(),
									temp.getCod_asig(),
									temp.getAsig());
					
				}
			}
		}
		
		return l;
	}
		
	public static ArrayList<Alumno_codigo>
		 alumnos_num_creciente(ArrayList<Alumno_codigo> l){
			 Alumno_codigo temp = new Alumno_codigo();
			 for(int i = 0; i < l.size(); i++) {
				 for(int r = i+1; r < l.size(); r++) {
					 if(l.get(i).getNip() > l.get(r).getNip()) {
						 temp.setAll(l.get(r).getAlumno(),
								 	 l.get(r).getNip(),
								 	 l.get(r).getCodigo());
						 l.get(r).setAll(l.get(i).getAlumno(),
								 		 l.get(i).getNip(),
								 		 l.get(i).getCodigo());
						 l.get(i).setAll(temp.getAlumno(),
								 		 temp.getNip(),
								 		 temp.getCodigo());
					 }
				 }
			 }
			return l;	
		}	
}
