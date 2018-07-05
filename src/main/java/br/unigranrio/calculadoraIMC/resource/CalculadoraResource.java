package br.unigranrio.calculadoraIMC.resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.unigranrio.calculadoraIMC.services.Calculadora;
import br.unigranrio.calculadoraIMC.services.CalculadoraImc;
import br.unigranrio.calculadoraIMC.services.Manual;
import br.unigranrio.calculadoraIMC.services.Resultado;
import br.unigranrio.calculadoraIMC.services.Tabela;
import br.unigranrio.calculadoraIMC.services.TabelaAdulto;
import br.unigranrio.calculadoraIMC.services.TabelaIdosa;
import br.unigranrio.calculadoraIMC.services.TabelaIdoso;
import br.unigranrio.calculadoraIMC.services.TabelaMenina;
import br.unigranrio.calculadoraIMC.services.TabelaMenino;

@CrossOrigin
@RestController
@RequestMapping("/calculadora")
public class CalculadoraResource {
	
	Resultado result;
	Tabela tab;
	Calculadora calc = new CalculadoraImc();
	
	@GetMapping(produces={"text/html"})
	public String manual() {
		return Manual.manual();
	}
	
	@GetMapping(value="/adulto", produces={"text/html"})
	public String adulto(@RequestParam("peso") float peso, @RequestParam("altura") float altura) {
		tab = new TabelaAdulto();
		result = new Resultado(tab, calc);
		return result.mostrar(peso, altura);
	}
	
	@GetMapping(value="/idoso", produces={"text/html"})
	public String idoso(@RequestParam("peso") float peso, @RequestParam("altura") float altura) {
		tab = new TabelaIdoso();
		result = new Resultado(tab, calc);
		return result.mostrar(peso, altura);
	}
	
	@GetMapping(value="/idosa", produces={"text/html"})
	public String idosa(@RequestParam("peso") float peso, @RequestParam("altura") float altura) {
		tab = new TabelaIdosa();
		result = new Resultado(tab, calc);
		return result.mostrar(peso, altura);
	}
	
	@GetMapping(value="/menina", produces={"text/html"})
	public String menina(@RequestParam("peso") float peso, @RequestParam("altura") float altura) {
		tab = new TabelaMenina();
		result = new Resultado(tab, calc);
		return result.mostrar(peso, altura);
	}
	
	@GetMapping(value="/menino", produces={"text/html"})
	public String menino(@RequestParam("peso") float peso, @RequestParam("altura") float altura) {
		tab = new TabelaMenino();
		result = new Resultado(tab, calc);
		return result.mostrar(peso, altura);
	}
}
