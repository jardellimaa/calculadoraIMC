package br.unigranrio.calculadoraIMC.services;

public class Resultado {
	
	Tabela tab;
	Calculadora calc;
	
	public Resultado(Tabela tab, Calculadora calc) {
		this.tab = tab;
		this.calc = calc;
	}
	
	public String mostrar(float peso, float altura) {
		return calc.calcular(peso, altura) + tab.gerar();
	}

}
