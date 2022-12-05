package Calendario;

import java.util.Iterator;

public class FechaDiciembre {

	public static void main(String[] args) {
		//declaracion de variables para el calendario
		Meses meses = new Meses();
		Temperaturas temperatura = new Temperaturas();
		String mesActual = "";
		int MaxDias = meses.getMesescon30();
		int Fechas[][] = new int [meses.getSemanasDiciembre()][meses.getDiasSemana()];
		int diasDiciembre = 28;
		
		
		for (int i = 0; i < meses.getSemanasDiciembre(); i++) {//con este ciclo mostramos el calendario
			
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
		temperatura.setCalcularTemperatura();
		
		//aplicando las temperaturas 
		/*for (int i = 0; i < MaxDias; i++) {
		
		}
		System.out.println("el promedio de las temperaturas es igual=" + temperatura.getTemperaturaPromedio() + "Grados");
	*/
		temperatura.getTemperaturaPromedio();
		temperatura.CalcularMayorYMenorTemperatura();
		for (int i = 0; i < MaxDias; i++) {
			System.out.println("la temperatura del dia " +  i + "= " + " del mes " + mesActual + "es" + temperatura.getTemperaturas(i) +  "grados");  //ciclo para hacer correr la matriz de las temperaturas
		}
		System.out.println(" " + "\n");
		System.out.println(temperatura.getTemperaturaPromedio());
		System.out.println("las temperaturas mayor al promedio son=" + temperatura.CalcularMayorPromedio() +"\nlas menores al promedio son= " + temperatura.CalcularMenorPromedio());
		System.out.println("las temperaturas mayores a 25 grados son= " + temperatura.calcularMayora25());
	}
}
