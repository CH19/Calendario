package Calendario;

public class Meses {

	final static int mesesCon30 = 30;
	final static int mesesCon31 = 31;
	
	public static int getMesescon30() {
		return mesesCon30;
	}


	public static int getMesescon31() {
		return mesesCon31;
	}
	final int DiasSemana = 7;
	final int SemanasDiciembre = 5;//declaramos como constantes los dias de la semana y las semanas de diciembre para que no hayan problemas 
	
	public Meses() {
		
	}
	
	
	public int getDiasSemana() {//el algoritmo esta hecho asi porque esta adaptado para hacerlo en diciembre del año 2022 especificamente
		return DiasSemana;
	}
	public int getSemanasDiciembre() {
		return SemanasDiciembre;
	}
	
}

class Temperaturas{
	private int TemperaturasDia[] = new int[31];
	public Temperaturas() {
		
	}
	

}
