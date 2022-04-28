package br.com.residencia;

public class Funcionario implements Comparable<Funcionario> {

	public String nome;
	public String cpf;
	public Double salario;

	public Funcionario(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public Funcionario() {

	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public int compareTo(Funcionario func) {
		if (this.getSalario() < func.getSalario()) {
			return -1;
		}
		if (this.getSalario() < func.getSalario()) {
			return 1;

		}

		return 0;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}
	
	
	
	
}
