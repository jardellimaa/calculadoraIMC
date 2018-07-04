package br.unigranrio.calculadoraIMC.services;

public class Manual {
	public static String manual() {
		return "<h1>Bem vindo a calculadora de IMC</h1>"
				+ "As consultas são feitas através do método HTTP<strong>GET</strong><br><br>"
				+ "Se tiver de 20 anos até 65 anos, utilize /adulto<br>"
				+ "Se tiver mais de 65 anos, utilize /idoso ou /idosa<br>"
				+ "Se tiver menos de 20 anos, utilize /menino ou /menina<br>"
				+ "Os parâmetros são: peso(ex: 72) e altura(ex: 1.75). Utilize ponto ao invés de vírgula!<br><br>"
				+ "Exemplo de uso: localhost:8080/calculadora/menino?peso=72&altura=1.75";
	}
}
