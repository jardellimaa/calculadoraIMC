package br.unigranrio.calculadoraIMC.services;

public class TabelaIdoso implements Tabela {

	@Override
	public String gerar() {
		return "<br>"
				+"<h2>Tabela Idoso(Homem acima de 65 anos):</h2>"
				+"<strong>Baixo peso</strong> = abaixo de 21,9 kg/m²"
				+"<br>"
				+"<strong>Peso normal</strong> = entre 22 e 27 kg/m²"
				+"<br>"
				+"<strong>Sobrepeso</strong> = entre 27,1 e 30 kg/m²"
				+"<br>"
				+"<strong>Obesidade grau I</strong> = entre 30,1 e 35 kg/m²"
				+"<br>"
				+"<strong>Obesidade grau II</strong> = entre 35,1 e 39,9 kg/m²"
				+"<br>"
				+"<strong>Obesidade grau III (obesidade mórbida)</strong> = maior que 40 kg/m²"
				+"<br>";
	}

}
