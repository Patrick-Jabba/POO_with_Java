package br.com.residencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Arrays {

	public static void main(String[] args) {

//		int tamanho = 10;
//
//		double[] arrayVar = new double[tamanho];
//
//		for (int i = 0; i < tamanho; i++) {
//			arrayVar[i] = i * tamanho;
//		}
//
//		for(int i = 0; i < arrayVar.length; i++) 
//		System.out.println(arrayVar[i]);

		// Contas
		List<ContaCorrente> contas = new ArrayList<>();

		ContaCorrente c1 = new ContaCorrente();
		c1.depositar(2000.0);
		ContaCorrente c2 = new ContaCorrente();
		c2.depositar(5000.0);
		ContaCorrente c3 = new ContaCorrente();
		c3.depositar(3000.0);
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		// System.out.println(contas);

//		Set<String> cargos = new HashSet<>(); Aleatorio
		// Set<String> cargos = new LinkedHashSet<>(); Na ordem inserida
		Set<String> cargos = new TreeSet<>(); // Ordem alfabética
		cargos.add("Gerente");
		cargos.add("Pirulito");
		cargos.add("Abdomen");
		cargos.add("Carimbo");
		// todos os metodos SET excluem os repetidos necessariamente

		System.out.println(cargos);
		
		
		//MAPS
		//cria o mapa
		Map<String, ContaCorrente> mapaDeContas = new HashMap<>();
		//adiciona duas chaves e seus respectivos valores
		
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		mapaDeContas.put("presidente", c3);
		
		
		//qual a conta do Diretor?
		ContaCorrente contaDoDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
		

		// FUNCIONARIOs

		Funcionario f1 = new Funcionario();
		f1.setSalario(5000.0);
		Funcionario f2 = new Funcionario();
		f2.setSalario(1500.0);
		Funcionario f3 = new Funcionario();
		f3.setSalario(2000.0);

		List<Funcionario> listaF = new ArrayList<>();
		listaF.add(f1);
		listaF.add(f3);
		listaF.add(f2);

		// System.out.println(listaF);
		Collections.sort(listaF);
		// System.out.println(listaF);

		List<String> lista3 = new ArrayList<>();
		lista3.add("SergX");
		lista3.add("Paulo");
		lista3.add("Zero");
		// System.out.println(lista3);
		Collections.sort(lista3);
		// System.out.println(lista3);

		// contas.add("uma string qualquer"); //nao funciona mais com GENERIC
		// pois o GENERIC restringe as listas a um determinado tipo de objeto

		Funcionario func = new Funcionario();
		ContaCorrente cc = new ContaCorrente();

		List lista = new ArrayList();
		lista.add("Manoel");
		lista.add("Patrick");
		lista.add("Mariane");
		lista.remove(1);
		lista.size();
//		
//		System.out.println(lista.size());
//		System.out.println(lista.get(1));
//		System.out.println(lista.size());
		// o tamanho da lista e atualizado
		// ou seja redimensionado

	}

}
