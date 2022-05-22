package trimestre_3.tarea3_jUnit;

import java.util.ArrayList;
import java.util.List;

public class Inicio {
	
	public static String povOf2 (int exp) {
		if(exp == 0) {
			return "0";
		}
		List<Integer> digits = new ArrayList<Integer>();
		digits.add(1);
		int size = 1;
		int tmp;
		int ac = 0;
		for(int i = 0; i < exp; i++) {
			for(int c = 0; c < size; c++) {
				tmp = digits.get(c);
				tmp *= 2;
				tmp += ac;
				ac = 0;
				if(tmp > 9) {
					tmp -= 10;
					ac = 1;
				}
				digits.set(c, tmp);
			}
			
			if(ac == 1) {
				digits.add(ac);
				size++;
				ac = 0;
			}	
		}
		
		String s = "";
		for(int i = digits.size()-1; i >=0; i--) {
			s += digits.get(i);
		}
		return s;
	}

	public static void main(String[] arg) {
		System.out.println(povOf2(1));
	}

}

