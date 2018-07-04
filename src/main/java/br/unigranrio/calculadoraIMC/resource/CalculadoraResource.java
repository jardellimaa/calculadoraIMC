package br.unigranrio.calculadoraIMC.resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.unigranrio.calculadoraIMC.services.CalculadoraImc;
import br.unigranrio.calculadoraIMC.services.Manual;
import br.unigranrio.calculadoraIMC.services.Resultado;
import br.unigranrio.calculadoraIMC.services.TabelaAdulto;
import br.unigranrio.calculadoraIMC.services.TabelaIdosa;
import br.unigranrio.calculadoraIMC.services.TabelaIdoso;
import br.unigranrio.calculadoraIMC.services.TabelaMenina;
import br.unigranrio.calculadoraIMC.services.TabelaMenino;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraResource {
	
	Resultado result;
	
	@CrossOrigin
	@GetMapping(produces={"text/html"})
	public String manual() {
		return Manual.manual();
	}
	
	@CrossOrigin
	@GetMapping(value="/adulto", produces={"text/html"})
	public String adulto(@RequestParam("peso") float peso, @RequestParam("altura") float altura) {
		result = new Resultado(new TabelaAdulto(), new CalculadoraImc());
		return result.mostrar(peso, altura);
	}
	
	@CrossOrigin
	@GetMapping(value="/idoso", produces={"text/html"})
	public String idoso(@RequestParam("peso") float peso, @RequestParam("altura") float altura) {
		result = new Resultado(new TabelaIdoso(), new CalculadoraImc());
		return result.mostrar(peso, altura);
	}
	
	@CrossOrigin
	@GetMapping(value="/idosa", produces={"text/html"})
	public String idosa(@RequestParam("peso") float peso, @RequestParam("altura") float altura) {
		result = new Resultado(new TabelaIdosa(), new CalculadoraImc());
		return result.mostrar(peso, altura);
	}
	
	@CrossOrigin
	@GetMapping(value="/menina", produces={"text/html"})
	public String menina(@RequestParam("peso") float peso, @RequestParam("altura") float altura) {
		result = new Resultado(new TabelaMenina(), new CalculadoraImc());
		return result.mostrar(peso, altura);
	}
	
	@CrossOrigin
	@GetMapping(value="/menino", produces={"text/html"})
	public String menino(@RequestParam("peso") float peso, @RequestParam("altura") float altura) {
		result = new Resultado(new TabelaMenino(), new CalculadoraImc());
		return result.mostrar(peso, altura);
	}
}
