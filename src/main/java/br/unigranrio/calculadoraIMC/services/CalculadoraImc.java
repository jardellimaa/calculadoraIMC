package br.unigranrio.calculadoraIMC.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraImc implements Calculadora {

	@Override
	public String calcular(float peso, float altura) {
		BigDecimal bd = new BigDecimal(peso/(altura*altura)).setScale(2, RoundingMode.HALF_EVEN);
		return "Resultado: " +String.valueOf(bd.doubleValue()) +" kg/m²";
	}

}
