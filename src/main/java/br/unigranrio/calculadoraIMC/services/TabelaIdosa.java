package br.unigranrio.calculadoraIMC.services;

public class TabelaIdosa implements Tabela {

	@Override
	public String gerar() {
		return "<br>"
				+"<h2>Tabela Idosa(Mulher acima de 65 anos):</h2>"
				+"<strong>Baixo peso</strong> = abaixo de 21,9 kg/m²"
				+"<br>"
				+"<strong>Peso normal</strong> = entre 22 e 27 kg/m²"
				+"<br>"
				+"<strong>Sobrepeso</strong> = entre 27,1 e 32 kg/m²"
				+"<br>"
				+"<strong>Obesidade grau I</strong> = entre 32,1 e 37 kg/m²"
				+"<br>"
				+"<strong>Obesidade grau II</strong> = entre 37,1 e 41,9 kg/m²"
				+"<br>"
				+"<strong>Obesidade grau III (obesidade mórbida)</strong> = maior que 42 kg/m²"
				+"<br>";
	}

}
