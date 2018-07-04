package br.unigranrio.calculadoraIMC.services;

public class TabelaMenino implements Tabela {

	@Override
	public String gerar() {
		return "<br>"
				+"<h2>Tabela Menino (Entre 2 e 20 anos):</h2>"
				+ "Com a tabela de idade e sexo fornecida abaixo, veja em que percentil o valor encontrado de índice de "
				+ "massa corporal se encaixa."
				+ "<br>"
				+ "Os resultados devem ser interpretados da seguinte forma:"
				+ "<br><br>"
				+ "<strong>Baixo peso</strong> = abaixo do percentil 10.\r\n"
				+ "<br>"
				+ "<strong>Peso normal</strong> = entre o percentil 15 e 85\r\n"
				+ "<br>"
				+ "<strong>Sobrepeso</strong> = entre o percentil 85 e 95\r\n"
				+ "<br>"
				+ "<strong>Obesidade</strong> = acima do percentil 95"
				+ "<br><br>"
				+ "<img src=\"https://www.mdsaude.com/wp-content/uploads/IMC-crianca-meninos.png\">";
	}
}
