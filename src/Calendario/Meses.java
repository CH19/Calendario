package Calendario;

import java.util.*;
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

class Temperaturas extends Meses{
	private int TemperaturasDia[] = new int[mesesCon31];
	private int TempraturaPromedio = 0;
	private int acumulador = 0;
	private int promedioTemperaturas = 0;
	private int TemperaturaMayorPromedio = 0;
	private int TemperaturaMenorPromedio = 0;
	private int TemperaturaMayorA25 = 0;
	private Integer PorcentajeMayorA25 = 0;
	public Temperaturas() {
		
	}
	
	public void setCalcularTemperatura() {
		Random ran = new Random();
	
		int rangoTemperaturas = 0;//con este metodo creo un numero random y lo convierto en positivo de una vez
		for (int i = 0; i < TemperaturasDia.length; i++) {
			do {
			 rangoTemperaturas = Math.abs(ran.nextInt(19) - 34) ; 
			}while(rangoTemperaturas < 19 || rangoTemperaturas > 35);
			TemperaturasDia[i] = rangoTemperaturas;
			this.acumulador += TemperaturasDia[i];//aqui acumulamos todas las temperaturas para sacar el promedio
		}
	}
	public int getTemperaturas(int num) {
		return TemperaturasDia[num];
	}
	public int getTemperaturaPromedio() {//funcion para calcular el promedio de las temperaturas
		
		this.promedioTemperaturas = this.acumulador / mesesCon31;
		return this.promedioTemperaturas;
	}
	public void CalcularMayorYMenorTemperatura() {//metodo para calcular el mayor o menor al promedio de la temperatura
		for (int i = 0; i < TemperaturasDia.length; i++) {
			if(TemperaturasDia[i] >= promedioTemperaturas) {
				TemperaturaMayorPromedio++;
			}else if(TemperaturasDia[i] < promedioTemperaturas) {
				TemperaturaMenorPromedio++;
			}
			if(TemperaturasDia[i] > 25) {
				TemperaturaMayorA25++;
			}
		}
	}
	public int CalcularMenorPromedio() {
		return TemperaturaMenorPromedio;
	}
	public int CalcularMayorPromedio() {
		return TemperaturaMayorPromedio;
	}
	public int calcularMayora25() {
		return TemperaturaMayorA25;
	}
}
