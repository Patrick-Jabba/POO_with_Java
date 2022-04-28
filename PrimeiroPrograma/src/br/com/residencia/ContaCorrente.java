package br.com.residencia;

public class ContaCorrente extends Conta {

	public String tipo;
	public Double saldo = 0.0;
	
	public ContaCorrente() {
		
	}

	@Override
	public String toString() {
		return "ContaCorrente [tipo=" + tipo + "]";
	}
	
	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void depositar(Double valor) {
		this.saldo = this.saldo + valor;
	}
	
	
}
