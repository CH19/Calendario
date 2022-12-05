package Calendario;

import java.util.Iterator;

public class FechaDiciembre {

	public static void main(String[] args) {
		//declaracion de variables para el calendario
		Meses meses = new Meses();
		String mesActual = "";
		int MaxDias = meses.getMesescon30();
		int Fechas[][] = new int [meses.getSemanasDiciembre()][meses.getDiasSemana()];
		int diasDiciembre = 28;
		int rangoTemperaturas = (int)  Math.random() * ( 34 - 19 );
		
		for (int i = 0; i < meses.getSemanasDiciembre(); i++) {
			
			for (int j = 0; j < meses.getDiasSemana(); j++) {
				
				Fechas[i][j] = diasDiciembre++;
				System.out.print(Fechas[i][j] +  "-");
				if(diasDiciembre > MaxDias) {
					diasDiciembre = 1;
					MaxDias = meses.getMesescon31();
					mesActual = "diciembre";
				}
				
			}
		System.out.println(" ");
		}
		
	}
}
