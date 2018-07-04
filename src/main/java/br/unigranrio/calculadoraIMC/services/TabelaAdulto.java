package br.unigranrio.calculadoraIMC.services;

public class TabelaAdulto implements Tabela {
	
	@Override
	public String gerar() {
		return "<br>"
		+"<h2>Tabela Adulto (Entre 20 e 65 anos):</h2>"
		+"<strong>Baixo peso muito grave</strong> = abaixo de 16 kg/m²"
		+"<br>"
		+"<strong>Baixo peso grave</strong> = entre 16 e 16,99 kg/m²"
		+"<br>"
		+"<strong>Baixo peso</strong> = entre 17 e 18,49 kg/m²"
		+"<br>"
		+"<strong>Peso normal</strong> = entre 18,50 e 24,99 kg/m²"
		+"<br>"
		+"<strong>Sobrepeso</strong> = entre 25 e 29,99 kg/m²"
		+"<br>"
		+"<strong>Obesidade grau I</strong> = entre 30 e 34,99 kg/m²"
		+"<br>"
		+"<strong>Obesidade grau II</strong> = entre 35 e 39,99 kg/m²"
		+"<br>"
		+"<strong>Obesidade grau III (obesidade mórbida)</strong> = maior que 40 kg/m²"
		+"<br>";
	}
}
