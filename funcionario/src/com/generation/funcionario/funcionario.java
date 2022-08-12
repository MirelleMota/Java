package com.generation.funcionario;

public class funcionario {
	
	private String nome;
	private String cargo;
	private String endereco;
	private int telefone;
	private float salario;
	
	public funcionario(String nome, String cargo, String endereco, int telefone, float salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.endereco = endereco;
		this.telefone = telefone;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void visualizar()
	{
		System.out.println("\nNome do funcion�rio: " + nome);
		System.out.println("\nCargo do funcion�rio: " + cargo);
		System.out.println("\nEndere�o do funcion�rio: " + endereco);
		System.out.println("\nTelefone do funcion�rio: " + telefone);
		System.out.println("\nSalario do funcion�rio: " + salario);
	}
	
	
}
